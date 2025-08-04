package oopsConcept;

public class AccessModifiers {
    /**
     * This class demonstrates the use of access modifiers in Java.
     * Access modifiers control the visibility of classes, methods, and variables.
     * The four main access modifiers are:
     * 1. public - accessible from any other class
     * 2. private - accessible only within the same class
     * 3. protected - accessible within the same package and subclasses even in different packages
     * 4. default (no modifier) - accessible only within the same package
     */

    public static void main(String[] args) {
        // Example usage of access modifiers can be added here
    }

    // Public variable
    public String publicVariable = "I am a public variable";
    // Private variable
    private String privateVariable = "I am a private variable";
    // Protected variable
    protected String protectedVariable = "I am a protected variable";
    // Default variable
    String defaultVariable = "I am a default variable";

    // Public method
    public void publicMethod() {
        System.out.println(publicVariable);
    }

    // Private method
    private void privateMethod() {
        System.out.println(privateVariable);
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println(protectedVariable);
    }

    // Default method
    void defaultMethod() {
        System.out.println(defaultVariable);
    }

    // Method to demonstrate access modifiers
    public void demonstrateAccessModifiers() {
        System.out.println("Accessing variables and methods within the same class:");
    }
}
