package lab3;

public class Lr3 {

    public static void main(String[] args) {
        int size = 3;

        Rectangle[] rectangles = new Rectangle[size];

        Rectangle rectangle1 = new Rectangle(5f, 4f);
        Rectangle rectangle2 = new Rectangle(3.5f);
        Rectangle rectangle3 = new Rectangle(4f, 4.8f);

        rectangles[0] = rectangle1;
        rectangles[1] = rectangle2;
        rectangles[2] = rectangle3;

        float totalArea = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("Прямоугольник №" + (i + 1) + ":");
            rectangles[i].printSize();
            System.out.println();
            totalArea += rectangles[i].area();
        }

        System.out.println("Суммарная площадь: " + totalArea);
    }

}
