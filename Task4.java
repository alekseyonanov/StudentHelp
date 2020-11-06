import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус: ");
        double radius = scanner.nextDouble();

        System.out.print("Введите длину хорды: ");
        double chord = scanner.nextDouble();

        double angle = 2 * Math.asin(chord / (2 * radius));

        double roundSquare = Math.PI * radius * radius;

        double segmentSquare = radius * radius * (angle - Math.sin(angle)) / 2;

        System.out.println("Радиус круга: " + roundSquare);
        System.out.println("Радиус сегмента: " + segmentSquare);
        System.out.println("Разница в площади: " + roundSquare / segmentSquare);
        
        scanner.close();
    }

}
