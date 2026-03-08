package javacity;

/*
 * ========== PHASE 4: THE PET SHELTER (Q13) ==========
 * Covers: Polymorphism — "many forms"
 * 
 * WHAT IS POLYMORPHISM?
 *   → One variable type, many possible behaviors.
 *   → You declare: Animal a = new Dog();
 *     The TYPE says Animal, but the ACTUAL OBJECT is a Dog.
 *     When you call a.makeSound(), Java runs DOG's version, not Animal's.
 * 
 * WHY IS THIS POWERFUL?
 *   → You can write ONE method that works for ANY animal.
 *   → checkHealth(Animal a) ← works for Dog, Cat, Parrot, anything!
 *   → You don't need checkDogHealth(), checkCatHealth() separately.
 */
public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Q13: Default sound — children will override this
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }

    public String getName() { return name; }
}
