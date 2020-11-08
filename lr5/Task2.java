package lr5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        try {
            if (line.length() == 0)
                throw new Exception("Пустая строка");

        } catch (Exception e) {
            System.out.println(e);
        }

        try {

            char[] symbols = line.toCharArray();
            int maxCount = 0;
            int count = 0;
            for (int i = 0; i < symbols.length; i++) {
                if (symbols[i] == 'a') {
                    count++;
                } else {
                    if (maxCount < count)
                        maxCount = count;
                    count = 0;
                }
            }

            System.out.println("Длина максимальной последовательности символов a: " + maxCount);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        scanner.close();
    }
}
