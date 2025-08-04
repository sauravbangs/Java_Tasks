package conditionalStatements;

public class NestedIfElse {
    public static void main(String[] args) {
        int number = 10;

        // Nested if-else demonstration
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
            // Nested check for even or odd
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else if (number < 0) {
            System.out.println("The number is negative.");
            // Nested check for even or odd
            if (number % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        } else {
            System.out.println("The number is zero.");
        }
    }
}
