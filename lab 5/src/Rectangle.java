public class Rectangle extends Shape {
    private double width;
    private double height;

    // Constructor to set the name, width, and height of the rectangle at instantiation
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    // Override the abstract method to calculate the area of the rectangle
    @Override
    public double calculateArea() {
        return width * height;
    }
}
