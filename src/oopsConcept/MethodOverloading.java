package oopsConcept;

public class MethodOverloading
{
    /**
     * This class demonstrates method overloading in Java.
     * Method overloading allows multiple methods to have the same name
     * but with different parameters (type, number, or order).
     */
    public static void main(String[] args)
    {
        MethodOverloading mo = new MethodOverloading();

        // Calling the method without parameters
        mo.wishHappyBirthday();

        // Calling the method with one parameter
        mo.wishHappyBirthday("Saurabh");

        // Calling the method with two parameters
        mo.wishHappyBirthday("Neeraj", 30);

        // Calling the method with one integer parameter
        mo.wishHappyBirthday(25);

        // Calling the method with parameters in different order
        mo.wishHappyBirthday(28, "Rahul");


    }

    void wishHappyBirthday()
    {
        System.out.println("Happy Birthday!");
    }

    void wishHappyBirthday(String name)
    {
        System.out.println("Happy Birthday " + name + "!");
    }
    void wishHappyBirthday(int age)
    {
        System.out.println("Happy Birthday! You are now " + age + " years old.");
    }

    void wishHappyBirthday(String name, int age)
    {
        System.out.println("Happy Birthday " + name + "! You are now " + age + " years old.");
    }

    void wishHappyBirthday(int age, String name)
    {
        System.out.println("Happy Birthday! You are now " + age + " years old, " + name + "!");
    }
}
