package conditionalStatements;

public class IfElseDemo {
    public static void main(String[] args) {
        int number = -10;
        //else-if demonstration

        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
         else if (number < -100) {
            System.out.println("The number is less than -100.");
        }
        else if (number > 100) {
            System.out.println("The number is greater than 100.");
        }
        else {
            System.out.println("The number is zero.");
        }

//         Check if the number is even or odd
//        if (number % 2 == 0) {
//            System.out.println("The number is even.");
//
//        }
//        if( number == 6)
//        {
//            System.out.println("Number is 6");
//        }
//        else {
//            System.out.println("The number is odd.");
//        }

        // Check if the number is within a specific range
//        if (number >= 1 && number <= 100) {
//            System.out.println("The number is within the range of 1 to 100.");
//        } else {
//            System.out.println("The number is outside the range of 1 to 100.");
//        }

        // Check if the number is a multiple of 5
//        if (number % 5 == 0) {
//            System.out.println("The number is a multiple of 5.");
//        } else {
//            System.out.println("The number is not a multiple of 5.");
//        }

    }
}
