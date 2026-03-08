package javacity;

/*
 * Q6: Bicycle EXTENDS Vehicle (inherits speed, fuel, move(), soundHorn())
 * Q7: OVERRIDES move() to say something specific to bicycles
 * Q8: Does NOT override soundHorn() — so it inherits "Ring Ring" from Vehicle
 * 
 * KEY CONCEPT: "extends" means "I am a type of Vehicle, I get everything Vehicle has,
 *              but I can CUSTOMIZE specific things."
 * 
 * Think of it like: Vehicle is the original recipe. Bicycle says 
 * "I'll use the same recipe but change the cooking method (move)."
 */
public class Bicycle extends Vehicle {

    // Constructor: We call super() to let the Vehicle part initialize itself
    // super(...) means "call the parent's constructor"
    public Bicycle(int speed) {
        super(speed, 0);  // Bicycles have 0 fuel — they're human powered!
    }

    // Q7: OVERRIDE — same method name as parent, but DIFFERENT behavior
    // @Override is a tag that says "I'm intentionally replacing the parent's version"
    @Override
    public void move() {
        System.out.println("Pedaling at " + speed + " km/h");
    }

    // Q8: We do NOT write soundHorn() here.
    // So when you call bicycle.soundHorn(), Java looks:
    //   1. Does Bicycle have soundHorn()? NO
    //   2. Does its parent Vehicle have it? YES → uses "Ring Ring"
    // This is INHERITED BEHAVIOR.
}
