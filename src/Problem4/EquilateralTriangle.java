package Problem4;

import Problem3.Triangle;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        super(name, side, side, side);  // all sides are equal
    }
}
