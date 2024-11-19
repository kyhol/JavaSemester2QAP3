package Problem2;

public class Point {
    // coordinates
    private float x;
    private float y;

    // constructor
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters
    public float getX() { return x; }
    public void setX(float x) { this.x = x; }
    public float getY() { return y; }
    public void setY(float y) { this.y = y; }

    // set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // get coordinates as array
    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "Point at (" + x + ", " + y + ")";
    }
}