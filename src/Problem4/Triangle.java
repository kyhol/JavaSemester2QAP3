package Problem4;

public class Triangle extends Shape {
    protected double side1, side2, side3;

    public Triangle(String name, double s1, double s2, double s3) {
        super(name);
        // Check if sides form a triangle
        if (isValidTriangle(s1, s2, s3)) {
            side1 = s1;
            side2 = s2;
            side3 = s3;
        } else {
            System.out.println("Error: Invalid triangle sides! :@");
            System.out.println(" ");
            System.out.println("-------------------------------------------------------");
            System.exit(1);
        }
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (b + c > a) && (c + a > b);
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Added scale method to implement Scalable interface
    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }
}