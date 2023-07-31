public class Circle extends Shape {
    private double radius;

    // Constructor to set the name and radius of the circle at instantiation
    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    // Override the abstract method to calculate the area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
