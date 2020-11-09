package lr3;

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

    public static class Rectangle {
        private float height;
        private float width;

        public Rectangle(float height, float width) {
            this.height = height;
            this.width = width;
        }

        public Rectangle(float side) {
            this(side, side);
        }

        public float getHeight() {
            return height;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        public float getWidth() {
            return width;
        }

        public void setWidth(float width) {
            this.width = width;
        }

        public void printSize() {
            System.out.println(height + " : " + width);
        }

        public float area() {
            return height * width;
        }
    }

}
