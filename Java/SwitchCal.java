package Java;
import java.util.Scanner;

public class SwitchCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Loop starts here so it repeats until user hits 'Exit'
        while(true) {
            System.out.println("\nEnter the Operations: ");
            System.out.println("1.Add\n2.Substract\n3.Divide\n4.Multply\n5.Exit");
            int option = sc.nextInt();
            
            // 2. Handle Exit immediately before asking for numbers
            if (option == 5) {
                System.out.println("Exiting...");
                break; // Properly breaks the while loop
            }
            
            // Handle invalid choices before doing math
            if (option < 1 || option > 5) {
                System.out.println("Invalid choice, please try again.");
                continue; // Skips the rest of the loop and starts over
            }

            System.out.println("Enter the First Number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the Second Number: ");
            int num2 = sc.nextInt();
            
            int ans = 0;

            switch(option) {
                case 1:  
                    ans = calAssit.add(num1, num2);
                    break;
                case 2:  
                    ans = calAssit.sub(num1, num2);
                    break;
                case 3: 
                    if(num2 == 0) {
                        System.out.println("Error: Cannot divide by 0");
                        continue; // Goes back to the start of the loop
                    } 
                    ans = calAssit.div(num1, num2);
                    break;
                case 4: 
                    ans = calAssit.mul(num1, num2);
                    break;
            }
            
            System.out.println("The answer is: " + ans);
        }
        sc.close(); // Good practice to close scanner
    }
}
