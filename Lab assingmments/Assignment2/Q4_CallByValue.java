public class Q4_CallByValue {

    static void modifyValue(int num) {
        num = num + 100;
        System.out.println("Inside method: num = " + num);
    }

    public static void main(String[] args) {
        int number = 50;
        System.out.println("Before method call: number = " + number);
        modifyValue(number);
        System.out.println("After method call: number = " + number);
        System.out.println("\n--> The original value did NOT change because Java uses Call by Value for primitives.");
    }
}
