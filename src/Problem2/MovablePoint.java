package Problem2;

public class MovablePoint extends Point {
    // speed components
    private float xSpeed;
    private float ySpeed;

    // constructor with position and speed
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);  // call Point constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // getters and setters for speed
    public float getXSpeed() { return xSpeed; }
    public void setXSpeed(float xs) { xSpeed = xs; }
    public float getYSpeed() { return ySpeed; }
    public void setYSpeed(float ys) { ySpeed = ys; }

    public void setSpeed(float xs, float ys) {
        xSpeed = xs;
        ySpeed = ys;
    }

    public float[] getSpeed() {
        float[] speeds = {xSpeed, ySpeed};
        return speeds;
    }

    // move the point based on speed
    public MovablePoint move() {
        // update position using getters/setters
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint at " + super.toString() +
                " with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}