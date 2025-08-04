package oopsConcept;

public class Encapsulation
{
    private String name;
    private int age;

    // Constructor
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() { return name;    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public static void main(String[] args) {
        Encapsulation person = new Encapsulation("Mukesh", 30);

        // Accessing private fields through public methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying private fields using setters
        person.setName("Saurabh");
        person.setAge(25);

        // Displaying updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Attempting to set an invalid age
        person.setAge(-5); // This will trigger the validation in the setter
    }
}
