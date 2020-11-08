package lr5;

import java.util.Scanner;

public class Task1 {
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

        char[] symbols = line.toCharArray();

        try {

            for (int i = 0; i < symbols.length; i++) {
                char symbol = symbols[i];
                boolean contains = false;
                for (int j = 0; j < i; j++) {
                    if (symbol == symbols[j]) {
                        contains = true;
                        break;
                    }
                }
                if (!contains) {
                    int count = 0;
                    for (int k = 0; k < symbols.length; k++) {
                        if (symbol == symbols[k]) {
                            count++;
                        }
                    }
                    System.out.println("Символ " + symbol + " встречается " + count + " раз");
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        scanner.close();
    }
}
