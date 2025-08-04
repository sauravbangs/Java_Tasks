package methods;

public class MathclassDemo
{
    public static void main(String[] args) {
        // Demonstrating the use of Math class methods
        double number = 25.0;

//        // Finding the square root of a number
//        double squareRoot = Math.sqrt(number);
//        System.out.println("Square root of " + number + " is: " + squareRoot);
//
        // Finding the absolute value of a number
//        int negativeNumber = -10;
//        int absoluteValue = Math.abs(negativeNumber);
//        System.out.println("Absolute value of " + negativeNumber + " is: " + absoluteValue);
//
        // Finding the maximum of two numbers
        int num1 = 15;
        int num2 = 20;
        int maxNumber = Math.max(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + maxNumber);
//
//        // Finding the minimum of two numbers
//        int minNumber = Math.min(num1, num2);
//        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + minNumber);
//
//        // Rounding a number
//        double decimalNumber = 5.67;
//        long roundedValue = Math.round(decimalNumber);
//        System.out.println("Rounded value of " + decimalNumber + " is: " + roundedValue);
//
//        //randonm number generation
//        int randomNumber = (int) (Math.random() * 100); // Generates a random number between 0 and 99
//
//
        //random number generation in range
        int minRange = 10;
        int maxRange = 50;
        int randomInRange = minRange + (int) (Math.random() * (maxRange - minRange + 1));
//        System.out.println("Random number between 0 and 99: " + randomNumber);
        System.out.println("Random number between " + minRange + " and " + maxRange + ": " + randomInRange);

    }
}
