package javacity;

/*
 * ========== PHASE 3: THE CITY POWER GRID (Q9) ==========
 * Covers: Interfaces
 * 
 * WHAT IS AN INTERFACE?
 *   → It's a CONTRACT / PROMISE.
 *   → It says: "Any class that implements me MUST have these methods."
 *   → Think of it like a job description:
 *     "If you want to be a PowerConsumer, you MUST know how to consumeEnergy."
 *     HOW you do it is up to you — a mall does it differently than a house.
 * 
 * WHY NOT JUST A CLASS?
 *   → A class can only extend ONE parent (single inheritance in Java).
 *   → But a class can implement MANY interfaces.
 *   → Interface = "what can you do?" vs Class = "what are you?"
 */
public interface PowerConsumer {

    // Q9: This is an ABSTRACT method (no body, no curly braces)
    // Any class implementing this MUST provide the actual code.
    void consumeEnergy(int watts);
}
