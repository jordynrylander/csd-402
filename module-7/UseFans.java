import java.util.ArrayList;

/*
 * Jordyn Rylander
 * CSD 402 - Module 7.2
 * 7/5/2026
 * create a collection of Fan objects and display
 * them using methods without using toString().
 */

public class UseFans {

    public static void main(String[] args) {

        // create a collection of Fan instances
        ArrayList<Fan> fans = new ArrayList<Fan>();

        fans.add(new Fan());
        fans.add(new Fan(Fan.SLOW, true, 7, "white"));
        fans.add(new Fan(Fan.MEDIUM, true, 8, "red"));
        fans.add(new Fan(Fan.FAST, true, 10, "blue"));

        // display all fans
        displayFans(fans);
    }

    // display all fans in the collection
    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println();
        }
    }

    // display one fan without using toString()
    public static void displayFan(Fan fan) {
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

}

class Fan {

    // fan speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // no-argument constructor
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    // constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // getter methods
    public int getSpeed() {
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    // setter methods
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        return "Fan [speed=" + this.speed
                + ", on=" + this.on
                + ", radius=" + this.radius
                + ", color=" + this.color + "]";
    }
}