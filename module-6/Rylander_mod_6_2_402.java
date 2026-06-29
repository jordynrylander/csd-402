/* Jordyn Rylander
 * CSd 402 - Module 6.2
 * 6/28/2026
 *  creating a fan class with constructors, constants, 
 * getter and setter methods and a toString method.
 */ 

public class Rylander_mod_6_2_402 {

    public static void main(String[] args) {

        // Create a fan using the default constructor
        Fan fan1 = new Fan();

        // Create a fan using the argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        // Display the default fan
        System.out.println("Fan 1:");
        System.out.println(fan1);

        System.out.println();

        // Display the fan created with the argument constructor
        System.out.println("Fan 2:");
        System.out.println(fan2);

        System.out.println();

        // Modify Fan 1 using the setter methods
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("red");

        System.out.println("Fan 1 After Changes:");
        System.out.println(fan1);
    }
}

class Fan {

    // Fan speed constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter methods
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setter methods
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

    // Return a description of the fan
    @Override
    public String toString() {
        return "Fan [speed=" + speed
                + ", on=" + on
                + ", radius=" + radius
                + ", color=" + color + "]";
    }
}