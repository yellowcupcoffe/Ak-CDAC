import java.util.Scanner;

public class Q3_UpdateArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Enter the index position to update (0 to " + (n - 1) + "): ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Error: Index out of bounds! Valid range is 0 to " + (n - 1));
        } else {
            System.out.print("Enter the new value: ");
            int newValue = sc.nextInt();
            arr[index] = newValue;

            System.out.print("Updated Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
