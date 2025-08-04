package learnObjectClass;

public class ObjectClassDemo
{

    public static void main(String[] args)
    {
        // Create an instance of the Object class
        Object obj = new Object();

        // Print the default string representation of the object
        System.out.println("Default toString(): " + obj.toString());

        // Print the hash code of the object
        System.out.println("Hash code: " + obj.hashCode());

        // Check if two objects are equal
        Object anotherObj = new Object();
        System.out.println("Are objects equal? " + obj.equals(anotherObj));

        // Get the class of the object
        System.out.println("Class of the object: " + obj.getClass().getName());
    }
}
