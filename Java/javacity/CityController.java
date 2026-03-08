package javacity;

/*
 * ========== THE MAIN CLASS: CITY CONTROLLER ==========
 * This is where you TEST everything you built.
 * Run this file to see all 20 questions in action.
 * 
 * HOW TO RUN IN ECLIPSE:
 * 1. Import this folder as a Java project
 * 2. Right-click CityController.java → Run As → Java Application
 */
public class CityController {

    // ========== Q16: A method that takes ANY Animal ==========
    // This is POLYMORPHISM in action.
    // The parameter type is Animal, but you can pass Dog, Cat, or anything.
    // Java figures out which makeSound() to call based on the ACTUAL object.
    public static void checkHealth(Animal a) {
        System.out.println("VET: Checking health of " + a.getName());
        a.makeSound(); // Java calls the RIGHT version automatically!
        System.out.println("VET: " + a.getName() + " is healthy! ✅");
    }

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║       WELCOME TO JAVA CITY! 🏙          ║");
        System.out.println("╚══════════════════════════════════════════╝");

        // ==========================================================
        //  PHASE 1: THE PERSONAL ID SYSTEM (Q1-Q4)
        // ==========================================================
        System.out.println("\n====== PHASE 1: CITIZEN REGISTRATION ======\n");

        // Q1 + Q4: Creating citizens — notice the ID auto-increments!
        Citizen c1 = new Citizen("Aarav", 22, "VOTER001", "pass123");
        Citizen c2 = new Citizen("Priya", 25, "VOTER002", "secret456");
        Citizen c3 = new Citizen("Rahul", 30, "VOTER003", "mypass789");

        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();

        // Q4: Static method — called on the CLASS, not on an object
        System.out.println("\nTotal citizens registered: " + Citizen.getTotalCitizens());

        // Q2: Testing age validation — try setting negative age
        System.out.println("\n--- Testing age validation ---");
        c1.setAge(23);   // Valid — should work
        c1.setAge(-5);   // Invalid — should print error
        c1.displayInfo(); // Age should be 23 (not -5)

        // Q3: Testing password change
        System.out.println("\n--- Testing password change ---");
        c1.changePassword("wrongpass", "newpass");  // Should FAIL
        c1.changePassword("pass123", "newpass");    // Should SUCCEED

        // ==========================================================
        //  PHASE 2: CITY TRANSPORT (Q5-Q8)
        // ==========================================================
        System.out.println("\n====== PHASE 2: CITY TRANSPORT ======\n");

        // Q5-6: Create vehicles
        Vehicle v = new Vehicle(50, 10);
        Bicycle bike = new Bicycle(15);
        Car car = new Car(120, 50);

        // Q5: Base class behavior
        System.out.println("--- Generic Vehicle ---");
        v.move();
        v.soundHorn();

        // Q7: Overridden behavior
        System.out.println("\n--- Bicycle ---");
        bike.move();          // "Pedaling at 15 km/h" (overridden)
        bike.soundHorn();     // "Ring Ring" (inherited from Vehicle! Not overridden)

        System.out.println("\n--- Car ---");
        car.move();           // "Driving at 120 km/h" (overridden)
        car.soundHorn();      // "Beep Beep" (overridden)

        // ==========================================================
        //  PHASE 3: CITY POWER GRID (Q9-Q12)
        // ==========================================================
        System.out.println("\n====== PHASE 3: CITY POWER GRID ======\n");

        // Q10: Both implement PowerConsumer but behave differently
        ShoppingMall mall = new ShoppingMall("MG Road, Block A", "Java Mall");
        TinyHouse house = new TinyHouse("Kiran");

        mall.displayInfo();

        // Q11: Same method call, DIFFERENT output (interface polymorphism!)
        System.out.println("\n--- Power consumption ---");
        mall.consumeEnergy(1500);  // Triggers "High usage warning!"
        mall.consumeEnergy(500);   // Normal usage
        house.consumeEnergy(200);  // Always "Powering the lights"

        // You can also use the interface type — THIS IS POLYMORPHISM with interfaces
        System.out.println("\n--- Using interface type ---");
        PowerConsumer pc1 = mall;    // ShoppingMall AS a PowerConsumer
        PowerConsumer pc2 = house;   // TinyHouse AS a PowerConsumer
        pc1.consumeEnergy(2000);
        pc2.consumeEnergy(100);

        // ==========================================================
        //  PHASE 4: PET SHELTER (Q13-Q16)
        // ==========================================================
        System.out.println("\n====== PHASE 4: PET SHELTER ======\n");

        // Q14: THE ARRAY CHALLENGE — An array of Animal, holding Dogs and Cats
        // The array TYPE is Animal[], but the ACTUAL objects are Dog and Cat
        Animal[] shelter = new Animal[4];
        shelter[0] = new Dog("Bruno");    // Dog stored as Animal
        shelter[1] = new Dog("Max");      // Dog stored as Animal
        shelter[2] = new Cat("Whiskers"); // Cat stored as Animal
        shelter[3] = new Cat("Luna");     // Cat stored as Animal

        // Q15: THE CHORUS — Loop and call makeSound()
        // Even though the array is Animal[], Java calls the RIGHT version!
        // This is RUNTIME POLYMORPHISM (Java decides at runtime which method to call)
        System.out.println("--- The Animal Chorus ---");
        for (int i = 0; i < shelter.length; i++) {
            shelter[i].makeSound();
        }

        // Q16: THE VET CHECK — One method handles ANY animal
        System.out.println("\n--- Vet Health Check ---");
        checkHealth(shelter[0]); // Passing a Dog
        System.out.println();
        checkHealth(shelter[2]); // Passing a Cat

        // ==========================================================
        //  PHASE 5: SMART HOME (Q17-Q20)
        // ==========================================================
        System.out.println("\n====== PHASE 5: SMART HOME ======\n");

        // Q18-19: Create a SmartRoom (it creates its own LightBulb & Speaker inside)
        SmartRoom bedroom = new SmartRoom("Bedroom");

        // Q19: Press the wall switch — delegates to LightBulb.toggle()
        System.out.println();
        bedroom.pressWallSwitch(); // ON
        bedroom.pressWallSwitch(); // OFF
        bedroom.pressWallSwitch(); // ON again

        // Q20: Party mode!
        System.out.println();
        bedroom.partyMode();

        System.out.println("\n╔══════════════════════════════════════════╗");
        System.out.println("║   ALL 20 QUESTIONS DEMONSTRATED! 🎉     ║");
        System.out.println("╚══════════════════════════════════════════╝");
    }
}
