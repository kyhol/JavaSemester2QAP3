package Problem3;

public abstract class Shape {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }
    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString() {
        return String.format("%s - Area: %.2f, Perimeter: %.2f",
                name, getArea(), getPerimeter());
    }
}
