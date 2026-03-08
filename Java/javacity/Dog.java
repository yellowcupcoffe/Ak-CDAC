package javacity;

/*
 * Q13: Dog IS-A Animal, overrides makeSound()
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof! 🐕");
    }
}
