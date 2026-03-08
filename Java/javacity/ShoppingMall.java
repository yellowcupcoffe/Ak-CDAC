package javacity;

/*
 * Q10 + Q11 + Q12: ShoppingMall
 * 
 * This class does TWO things at once:
 *   1. EXTENDS Building    → gets the address field and constructor
 *   2. IMPLEMENTS PowerConsumer → MUST provide consumeEnergy() method
 * 
 * This is the beauty of Java's design:
 *   → You can only extend ONE class (Building)
 *   → But you can implement MANY interfaces (PowerConsumer, and more if needed)
 * 
 * "extends" = IS-A relationship:  "ShoppingMall IS A Building"
 * "implements" = CAN-DO relationship: "ShoppingMall CAN consume power"
 */
public class ShoppingMall extends Building implements PowerConsumer {

    private String mallName;

    public ShoppingMall(String address, String mallName) {
        super(address); // Call Building's constructor to set the address
        this.mallName = mallName;
    }

    // Q10 + Q11: We MUST implement this because we said "implements PowerConsumer"
    // If we don't, Java will give a compile error: "must implement abstract method"
    @Override
    public void consumeEnergy(int watts) {
        System.out.println("[" + mallName + "] consuming " + watts + " watts");
        if (watts > 1000) {
            System.out.println("⚠ High usage warning!");
        }
    }

    public void displayInfo() {
        System.out.println("Mall: " + mallName + " at " + address);
    }
}
