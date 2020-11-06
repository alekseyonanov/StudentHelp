import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        System.out.println("Порядковый номер: " + (int) symbol);
        System.out.println("Предыдущий символ: " + ((char) (symbol - 1)));
        System.out.println("Следующий символ: " + ((char) (symbol + 1)));
    }
}
