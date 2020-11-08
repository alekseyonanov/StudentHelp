package lr5;

import java.util.Scanner;

public class Task3 {
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
            String insideLine = "";
            boolean isInside = false;
            for (int i = 0; i < symbols.length; i++) {
                if (symbols[i] == '{') {
                    isInside = true;
                    continue;
                }
                if (symbols[i] == '}') {
                    isInside = false;
                }
                if (isInside) {
                    insideLine += symbols[i];
                }

            }
            System.out.println("Строка внутри скобок: " + insideLine);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        scanner.close();
    }
}
