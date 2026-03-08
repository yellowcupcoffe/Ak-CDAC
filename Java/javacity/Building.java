package javacity;

/*
 * ========== PHASE 3 (Q12): ABSTRACT CLASS ==========
 * 
 * WHAT IS AN ABSTRACT CLASS?
 *   → It's a class that is INCOMPLETE on purpose.
 *   → You CANNOT create an object of it: new Building() ← ERROR!
 *   → But other classes can EXTEND it and finish the incomplete parts.
 * 
 * DIFFERENCE: Interface vs Abstract Class
 *   → Interface: ONLY method signatures, no fields, no constructors (pure contract)
 *   → Abstract class: CAN have fields, constructors, AND regular methods
 *     plus some abstract (unfinished) methods.
 * 
 * Think of it: 
 *   Interface = "You must be able to swim" (just a requirement)
 *   Abstract class = "Here's a half-built house. Finish the rest." (partial blueprint)
 */
public abstract class Building {

    // Q12: This is a REAL field with a value. Abstract classes CAN have fields.
    protected String address;

    public Building(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    // You could add abstract methods here too, e.g.:
    // public abstract double calculateRent();
    // Then every child would HAVE to implement calculateRent()
}
