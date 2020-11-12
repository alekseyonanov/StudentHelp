public class Rectangle {
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
