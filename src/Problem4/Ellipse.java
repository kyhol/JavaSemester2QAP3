package Problem4;

import Problem3.Shape;

public class Ellipse extends Shape {
    protected double a;  // major
    protected double b;  // minor

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // make sure a is large than b
        this.a = Math.max(axis1, axis2);
        this.b = Math.min(axis1, axis2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * (2 * Math.sqrt((a * a + b * b) / 2));
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
}