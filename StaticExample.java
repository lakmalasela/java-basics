public class StaticExample {

    // Static variable
    static int staticCounter = 0;

    // Static method
    static void incrementCounter() {
        staticCounter++;
        System.out.println("Static Counter: " + staticCounter);
    }

    public static void main(String[] args) {
        // Calling static method without creating an object
        StaticExample.incrementCounter(); // Static Counter: 1
        StaticExample.incrementCounter(); // Static Counter: 2

        // Accessing static variable directly
        System.out.println("Accessing static variable: " + StaticExample.staticCounter); // Accessing static variable: 2
    }


}
