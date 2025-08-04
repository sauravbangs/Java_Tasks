package oopsConcept;

public class Constructors
{
    /**
     * This class demonstrates the use of constructors in Java.
     * Constructors are special methods used to initialize objects.
     * They have the same name as the class and do not have a return type.
     * This keyword 'this' is used to refer to the current object.
     * This can be used to differentiate between instance variables and parameters when they have the same name.
     * This can be used to call methods or constructors of the same class.
     *
     */
    public static void main(String[] args)
    {
        // Creating an object of the Student class using the default constructor
        Student defaultStudent = new Student();
        defaultStudent.displayDetails();

        // Creating an object of the Student class using the constructor
        Student student = new Student("Saurabh", 20, 101);
        student.displayDetails();

        // Creating another object of the Student class using the constructor
        Student anotherStudent = new Student("Rahul", 22, 102);
        anotherStudent.displayDetails();
    }

    static  class Student
    {
        public String name;
        public int age;
        public int rollNumber;

        // Default constructor
        public Student()
        {
            this.name = "Unknown";
            this.age = 0;
            this.rollNumber = 0;
            System.out.println("Default constructor called. Initializing with default values.");
        }

        // Constructor to initialize student details
        public Student(String name, int age, int rollNumber)
        {
            this.name = name;
            this.age = age;
            this.rollNumber = rollNumber;
            System.out.println("Parameterized constructor called. Initializing with provided values.");
        }

        // Method to display student details
        public void displayDetails()
        {
            System.out.println("Student Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println();
            this.setName("Rohit"); // Example of using 'this' to call a method
        }

        // This method can be used to demonstrate the use of 'this' keyword
        public void setName(String name)
        {
            this.name = name; // 'this' refers to the instance variable
            System.out.println("Name set to: " + this.name);
            //System.out.println(name);
        }
    }
}
