package oopsConcept;

public class Inheritance
{
    /**
     * This class demonstrates the concept of inheritance in Java.
     * Inheritance allows a class to inherit properties and methods from another class.
     * The class that inherits is called the subclass (or child class), and the class being inherited from is called the superclass (or parent class).
     * In this example, we have a base class 'Animal' and derived classes 'Dog' and 'Cat'.
     */
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Bark

        Cat cat = new Cat();
        cat.makeSound(); // Output: Meow
    }
}
// Base class
class Animal
{
    Animal()
    {
        System.out.println("Animal constructor called");
    }

    public void makeSound()
    {
        System.out.println("Animal makes a sound");
    }
}
// Derived class
class Dog extends Animal
{
    Dog()
    {
        super(); // Call to the parent class constructor
    }

    public void makeSound()
    {
        super.makeSound();
        System.out.println("Bark");
    }
}
// Another derived class
class Cat extends Animal
{

    public void makeSound()
    {
        super.makeSound();
        //System.out.println("Meow");
    }
}
