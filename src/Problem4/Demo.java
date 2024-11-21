package Problem4;

public class Demo {
    // Add static method for scaling shapes
    public static void scaleShapes(Scalable[] shapes, double factor) {
        System.out.println("\n\t\t\tScaling Shapes by factor: " + factor);
        System.out.println("-------------------------------------------------------");

        System.out.println("Before scaling:");
        for (Scalable s : shapes) {
            System.out.println(s);
        }

        // Applied scaling
        for (Scalable s : shapes) {
            s.scale(factor);
        }

        System.out.println("\nAfter scaling:");
        for (Scalable s : shapes) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------------");
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Circle A", 11.0),
                new Ellipse("Ellipse A", 10.0, 6.0),
                new Triangle("Triangle A", 4.0, 5.0, 6.0),
                new EquilateralTriangle("Equilateral Triangle A", 9.0)
        };

        System.out.println("\n");
        System.out.println("\t\t\t\t  Initial Shape Information:");
        System.out.println("-------------------------------------------------------");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("-------------------------------------------------------");

//        // Calling / Testing scale with different factors
        scaleShapes(shapes, 2.0);  // double the size
        scaleShapes(shapes, 0.5);  // half the size

//        // Test invalid triangle creation
//        try {
//            System.out.println("\nTrying to create invalid triangle...");
//            Triangle invalidTriangle = new Triangle("Invalid", 1.0, 1.0, 10.0);
//        } catch (Exception e) {
//            System.out.println("Failed to create triangle");
//            System.out.println("-------------------------------------------------------");
//        }
    }
}