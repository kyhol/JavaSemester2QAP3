package Problem2;

public class Demo {
    public static void main(String[] args) {
        // create test points
        Point p1 = new Point(2.5f, 3.5f);
        System.out.println("\n");
        System.out.println("Created: " + p1);

        MovablePoint mp = new MovablePoint(1.0f, 1.0f, 0.5f, 0.5f);
        System.out.println("\nCreated movable point: " + mp);

        // test moving
        System.out.println("Moving point...");
        mp.move();
        System.out.println("After move: " + mp);

        // change speed and move again
        mp.setSpeed(1.0f, 2.0f);
        System.out.println("\nChanged speed to (1.0, 2.0)");
        mp.move();
        System.out.println("After another move: " + mp);
    }
}