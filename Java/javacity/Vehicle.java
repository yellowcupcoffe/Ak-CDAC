package javacity;

/*
 * ========== PHASE 2: THE CITY TRANSPORT (Q5, Q8) ==========
 * Covers: Inheritance, method overriding
 * 
 * WHAT YOU NEED TO UNDERSTAND FOR CLASS:
 * 
 * Q5: "Create Vehicle with speed, fuel, and move()"
 *     → This is the PARENT/BASE class. Think of it as the GENERAL idea of a vehicle.
 *       All vehicles have speed, fuel, and can move.
 * 
 * Q8: "Add soundHorn() to Vehicle"
 *     → This is a DEFAULT behavior. If a child class doesn't override it,
 *       it uses the parent's version. Bicycle will use "Ring Ring" by default.
 */
public class Vehicle {

    // These are PROTECTED — meaning child classes (Bicycle, Car) CAN access them
    // but random outside code cannot. It's like a family secret.
    protected int speed;
    protected int fuel;

    public Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    // Q5: Default move behavior
    public void move() {
        System.out.println("Vehicle is moving.");
    }

    // Q8: Default horn — Bicycle will INHERIT this as-is
    public void soundHorn() {
        System.out.println("Ring Ring");
    }

    public void displayInfo() {
        System.out.println("Speed: " + speed + " km/h, Fuel: " + fuel + "L");
    }
}
