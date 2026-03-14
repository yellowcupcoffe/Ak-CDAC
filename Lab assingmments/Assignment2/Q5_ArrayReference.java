public class Q5_ArrayReference {

    static void modifyArray(int[] arr) {
        arr[0] = 999;
        arr[1] = 888;
        System.out.println("Inside method: arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Before method call: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        modifyArray(numbers);

        System.out.print("After method call: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("\n--> Changes made inside the method AFFECTED the original array because arrays are passed by reference value.");
    }
}
