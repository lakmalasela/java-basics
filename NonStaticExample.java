public class NonStaticExample {

    // Non-static variable
    int instanceCounter = 0;

    String firstName = "Kamal Perera";

    // Non-static method
    void incrementCounter() {
        instanceCounter++;
        System.out.println("Instance Counter: " + instanceCounter);
    }

    public static void main(String[] args) {

//        NonStaticExample nonStaticExampleobj = new NonStaticExample();
//        System.out.println(nonStaticExampleobj.firstName);



        // Creating instances of NonStaticExample
        NonStaticExample obj1 = new NonStaticExample();
        NonStaticExample obj2 = new NonStaticExample();

        // Incrementing counters for both objects
        obj1.incrementCounter(); // Instance Counter: 1
        obj1.incrementCounter(); // Instance Counter: 2

        obj2.incrementCounter(); // Instance Counter: 1
        obj2.incrementCounter(); // Instance Counter: 2

        // Accessing instance variable
        System.out.println("Obj1 Instance Counter: " + obj1.instanceCounter); // Obj1 Instance Counter: 2
        System.out.println("Obj2 Instance Counter: " + obj2.instanceCounter); // Obj2 Instance Counter: 2
    }
}
