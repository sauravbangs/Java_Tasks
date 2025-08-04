package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // This is a simple while loop that prints "Test program" 5 times
        // The loop starts with i = 0, continues while i < 5, and increments i by 1 each iteration
//        int i = 0;
//        while (i < 5) {
//            System.out.println("Test program");
//            i++;
//        }

        // while loop to print sum of n natural numbers
//        int n = 5; // You can change this value to sum a different number of natural numbers
//        int sum = 0; // Initialize sum to 0
//        int j = 1; // Start from the first natural number
//        while (j <= n) {
//            sum += j; // Add the current number to the sum
//            j++; // Increment j for the next iteration
//        }
//        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        //example of while loop when condition has boolean value
        boolean whileLoopConcept = false;
        while (!whileLoopConcept) {

            System.out.println("Have you learned the while loop concept?");
            Scanner sc = new Scanner(System.in);
             whileLoopConcept = sc.nextBoolean();


        }
    }
}
