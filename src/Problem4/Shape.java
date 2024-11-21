package Problem4;

public abstract class Shape implements Scalable  {
    protected String name; //public : accessible from everywhere.
    // protected : accessible by the classes of the same package and the subclasses residing in any package.

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
