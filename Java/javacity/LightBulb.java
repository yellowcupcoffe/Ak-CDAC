package javacity;

/*
 * ========== PHASE 5: THE SMART HOME (Q17) ==========
 * Covers: Composition — "HAS-A" relationship
 * 
 * COMPOSITION vs INHERITANCE:
 *   Inheritance: "A Dog IS-A Animal"     → Dog extends Animal
 *   Composition: "A SmartRoom HAS-A LightBulb" → SmartRoom contains a LightBulb object
 * 
 * WHY COMPOSITION?
 *   → Not everything is an "IS-A" relationship.
 *   → A SmartRoom is NOT a type of LightBulb — that makes no sense.
 *   → But a SmartRoom CONTAINS a LightBulb inside it.
 *   → This is like real life: your room HAS a light, it's not a type of light.
 */
public class LightBulb {

    // Q17: Simple on/off state
    private boolean isOn;

    public LightBulb() {
        this.isOn = false; // starts off
    }

    // Q17: Toggle = if it's on, turn off. If it's off, turn on.
    public void toggle() {
        isOn = !isOn; // flip the boolean (true→false, false→true)
        System.out.println("💡 Light is now " + (isOn ? "ON" : "OFF"));
    }

    public boolean isOn() { return isOn; }
}
