package lr6;

import java.io.*;
import java.net.*;

class Server extends Thread
{
    Socket s;
    int num;

    public static void main(String args[])
    {
        try
        {
            int i = 0; // счётчик подключений

            // привинтить сокет на локалхост, порт 3128
            ServerSocket server = new ServerSocket(3128, 0,
                    InetAddress.getByName("localhost"));

            System.out.println("server is started");

            // слушаем порт
            while(true)
            {
                // ждём нового подключения, после чего запускаем обработку клиента
                // в новый вычислительный поток и увеличиваем счётчик на единичку
                new Server(i, server.accept());
                i++;
                System.out.println("На сервер поступил запрос №: "+i);
            }
        }
        catch(Exception e)
        {System.out.println("init error: "+e);} // вывод исключений
    }

    public Server(int num, Socket s)
    {
        // копируем данные
        this.num = num;
        this.s = s;

        // и запускаем новый вычислительный поток (см. ф-ю run())
        setDaemon(true);
        setPriority(NORM_PRIORITY);
        start();
    }
// В классе  Thread следует перекрыть метод  run() , который в интерфейсе  Runnuble  является абстрактным.
// Внутри метода  run()  помещаются операторы, которые должны выполняться в потоке.
// Метод run() может обьявлять переменные, вызывать другие методы и использовать другие классы.
// По концу метода поток завершает работу. Метод run() вызывается методом start() .

    public void run()
    {
        try
        {
            // из сокета клиента берём поток входящих данных
            InputStream is = s.getInputStream();
            // и оттуда же - поток данных от сервера к клиенту
            OutputStream os = s.getOutputStream();

            // буффер данных в 64 килобайта
            byte[] buf = new byte[64*1024];
            // читаем 64кб от клиента, результат - кол-во реально принятых данных
            int r = is.read(buf);

            // создаём строку, содержащую полученную от клиента информацию
            double x = Double.parseDouble(new String(buf, 0, r));
            buf = new byte[64*1024];

            r = is.read(buf);

            int n = Integer.parseInt(new String(buf, 0, r));

            double y = 0;
            for (int i = 1; i <= n; i++) {
                y += Math.pow(Math.cos(x), i);
            }

            // выводим данные:
            os.write(Double.toString(y).getBytes());

            // завершаем соединение
            s.close();
        }
        catch(Exception e)
        {System.out.println("init error: "+e);} // вывод исключений
    }
}
