public abstract class Shape {
    private String name;

    // Constructor to set the name of the shape at instantiation
    public Shape(String name) {
        this.name = name;
    }

    // Abstract method to calculate the area of the shape
    public abstract double calculateArea();

    // Non-abstract method to display the shape's name and area
    public void display() {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}
