public class App {
    public static void main(String[] args) throws Exception {
        Shape circle = new Circle("Circle", 5.0);
        circle.display();

        // Create a Rectangle object and pass the required values at instantiation
        Shape rectangle = new Rectangle("Rectangle", 4.0, 6.0);
        rectangle.display();
    }
}
