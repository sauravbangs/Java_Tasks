package conditionalStatements;

public class TernaryOperator {
    public static void main(String[] args) {
        int number = 11;
        // Using if-else to check if the number is positive, negative, or zero
//        if(number % 2 == 0) {
//            System.out.println("The number is even.");
//        } else {
//            System.out.println("The number is odd.");
//        }

        // Using the ternary operator to check if the number is even or odd
        // The ternary operator is a shorthand for if-else statements
        // Expression must return a value
        // Expressions must be of the same type
        // Syntax: condition ? expressionIfTrue : expressionIfFalse
        String result = (number % 2 == 0) ? "The number is even." : "The number is odd.";
        System.out.println(result);

        // Using the ternary operator to find the maximum of two numbers
//        int max, a = 10, b = 20;
//        max = (a > b) ? a : b;
//        System.out.println("The maximum number is: " + max);


        // Using the ternary operator to check if the number is positive, negative, or zero
//        String sign = (number > 0) ? "The number is positive." :
//                      (number < 0) ? "The number is negative." : "The number is zero.";
//        System.out.println(sign);
    }
}
