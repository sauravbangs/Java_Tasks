public class StaticNonStaticDemo {
    // Static variable
    static int staticVar = 100;
    // Non-static variable
    int nonStaticVar = 200;

    public void display() {
        System.out.println("Static variable: " + staticVar);
        System.out.println("Non-static variable: " + nonStaticVar);
    }

    public static void main(String[] args) {
        // Accessing static variable directly
        System.out.println("Accessing static variable directly: " + staticVar);

        // Creating first object
        StaticNonStaticDemo obj1 = new StaticNonStaticDemo();
        obj1.nonStaticVar = 300;
        obj1.display();

        // Creating second object
        StaticNonStaticDemo obj2 = new StaticNonStaticDemo();
        obj2.nonStaticVar = 400;
        obj2.display();

        // Modifying static variable
        staticVar = 500;
        System.out.println("Static variable after modification: " + staticVar);
        obj1.display();
        obj2.display();
    }
}

