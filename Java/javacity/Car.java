package javacity;

/*
 * Q6: Car EXTENDS Vehicle
 * Q7: OVERRIDES move() — "Driving at [speed] km/h"
 * Q8: OVERRIDES soundHorn() — "Beep Beep" (replaces the default "Ring Ring")
 * 
 * KEY DIFFERENCE from Bicycle:
 *   - Bicycle lets soundHorn() stay as the parent's version
 *   - Car REPLACES soundHorn() with its own version
 *   This shows: you can CHOOSE which methods to override and which to keep.
 */
public class Car extends Vehicle {

    public Car(int speed, int fuel) {
        super(speed, fuel); // Cars DO need fuel
    }

    // Q7: Override move
    @Override
    public void move() {
        System.out.println("Driving at " + speed + " km/h");
    }

    // Q8: Override soundHorn (Bicycle doesn't do this, Car does)
    @Override
    public void soundHorn() {
        System.out.println("Beep Beep");
    }
}
