package lr6;

import java.net.Socket;
import java.util.Scanner;

class Client extends Thread {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x = ");
        double x = scanner.nextDouble();
        System.out.print("Введите n = ");
        int n = scanner.nextInt();

        scanner.close();

        try {
            // открываем сокет и коннектимся к localhost:3128
            // получаем сокет сервера
            Socket s = new Socket("127.0.0.1", 3128);

            s.getOutputStream().write(Double.toString(x).getBytes());
            s.getOutputStream().write(Integer.toString(n).getBytes());

            // читаем ответ
            byte[] buf = new byte[64 * 1024];
            int r = s.getInputStream().read(buf);
            String data = new String(buf, 0, r);

            // выводим ответ в консоль
            System.out.println("Результат вычисления = " + data);
        } catch (Exception e) {
            System.out.println("init error: " + e);
        } // вывод исключений
    }
}
