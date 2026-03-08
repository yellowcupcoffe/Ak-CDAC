package javacity;

import java.util.Scanner;

/*
 * ========== PHASE 1: THE PERSONAL ID SYSTEM ==========
 * Covers: Classes, Encapsulation, static keyword, constructors
 * 
 * WHAT YOU NEED TO UNDERSTAND FOR CLASS:
 * 
 * Q1: "Create a Citizen class with name, age, voterID"
 *     → This is just creating a blueprint. Think of a class like a form template.
 *       Every citizen will FILL IN the same form (name, age, voterID).
 * 
 * Q2: "Make all fields private. Create setAge() with validation"
 *     → ENCAPSULATION = hiding your data behind a wall.
 *       WHY? So nobody can do citizen.age = -5 (that makes no sense).
 *       Instead they MUST use setAge() which checks if the value is valid.
 *       Like a bouncer at a club — you can't just walk in, you go through the door.
 * 
 * Q3: "Secret password with changePassword()"
 *     → Same concept. The password is private. You can't just see or change it.
 *       You MUST prove you know the old password before changing it.
 * 
 * Q4: "Automatic ID using static"
 *     → STATIC = shared by ALL objects of this class.
 *       Think of it like a "next token number" machine at a bank.
 *       Each customer gets the next number. The machine is shared, not per-person.
 *       citizenCount belongs to the CLASS, not to any one Citizen.
 */
public class Citizen {

    // ---- Q4: Static counter (shared across ALL Citizen objects) ----
    // This is like a global counter. Every time a new Citizen is created,
    // this goes up by 1. It does NOT belong to any single citizen.
    private static int citizenCount = 0;

    // ---- Q1: The fields (what info does a Citizen have?) ----
    // ---- Q2: They are PRIVATE (nobody outside can touch them directly) ----
    private String name;
    private int age;
    private String voterID;
    private int citizenID; // auto-assigned from citizenCount

    // ---- Q3: Secret password ----
    private String password;

    // ---- CONSTRUCTOR: What happens when you write "new Citizen(...)" ----
    // This runs AUTOMATICALLY when creating a new object.
    public Citizen(String name, int age, String voterID, String password) {
        // Q4: Increment the shared counter and assign unique ID
        citizenCount++;           // counter goes from 0→1, 1→2, etc.
        this.citizenID = citizenCount; // THIS citizen gets that number

        this.name = name;
        this.password = password;
        this.voterID = voterID;

        // Use the setter (not direct assignment) so validation runs!
        setAge(age);
    }

    // ---- Q2: Setter with validation (THE BOUNCER) ----
    // If someone tries to set age to -5, we reject it.
    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("ERROR: Age cannot be negative! Got: " + newAge);
        } else {
            this.age = newAge;
        }
    }

    // ---- Q3: Change password (must know the old one first) ----
    // Think: You can't change your bank PIN unless you enter the current one first.
    public void changePassword(String oldPass, String newPass) {
        if (this.password.equals(oldPass)) {
            this.password = newPass;
            System.out.println("Password changed successfully for " + name);
        } else {
            System.out.println("ERROR: Old password does not match!");
        }
    }

    // ---- GETTERS: How the outside world READS the data ----
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getVoterID() { return voterID; }
    public int getCitizenID() { return citizenID; }

    // Q4: Static method — you can call this WITHOUT creating an object
    // Citizen.getTotalCitizens() — notice you use the CLASS name, not an object
    public static int getTotalCitizens() { return citizenCount; }

    // Nice display method
    public void displayInfo() {
        System.out.println("--- Citizen #" + citizenID + " ---");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("VoterID : " + voterID);
        // NOTE: We do NOT print the password. It's secret!
    }
}
