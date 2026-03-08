package javacity;

/*
 * Q13: Cat IS-A Animal, overrides makeSound()
 */
public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow! 🐱");
    }
}
