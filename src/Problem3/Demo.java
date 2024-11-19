package Problem3;

public class Demo {
    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle("Circle A", 11.0),
                new Ellipse("Ellipse A", 10.0, 6.0),
                new Triangle("Triangle A", 4.0, 5.0, 6.0),
                new EquilateralTriangle("Equilateral Triangle A", 9.0)
        };
        System.out.println("\n");
        System.out.println("\t\t\t\t  Shape Information:");
        System.out.println("------------------------------------------------------");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("------------------------------------------------------");

        try {
            System.out.println("\nTrying to create invalid triangle...");
            Triangle invalidTriangle = new Triangle("Invalid", 1.0, 1.0, 10.0);
        } catch (Exception e) {
            System.out.println("Failed to create invalid triangle");

        }
    }
}