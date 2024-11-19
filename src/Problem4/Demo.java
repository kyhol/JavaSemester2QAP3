package Problem4;

import Problem3.Circle;
import Problem3.Ellipse;
import Problem3.EquilateralTriangle;
import Problem3.Shape;
import Problem3.Triangle;

public class Demo {
    public static void main(String[] args) {

        Problem3.Shape[] shapes = {
                new Circle("Circle A", 11.0),
                new Ellipse("Ellipse A", 10.0, 6.0),
                new Problem3.Triangle("Triangle A", 4.0, 5.0, 6.0),
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
            Problem3.Triangle invalidTriangle = new Triangle("Invalid", 1.0, 1.0, 10.0);
        } catch (Exception e) {
            System.out.println("Failed to create invalid triangle");

        }
    }
}