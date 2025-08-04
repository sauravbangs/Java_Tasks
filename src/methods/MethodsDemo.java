package methods;

public class MethodsDemo
{
    // This is a simple Java program demonstrating the use of methods.
    // A method is a block of code that performs a specific task. It is used to achieve
    // code reusability and organization.

    public static void main(String[] args)
    {
//        for(String aa: args)
//        {
//            System.out.println("Command line argument: " + aa);
//        }



        // Calling the method to print a message
        printMessage();

        // Calling the method to calculate the sum of two numbers
        int sum = calculateSum(5, 10);
        System.out.println("The sum is: " + sum);

        // Calling the method to find the maximum of two numbers
        int max = findMax(15, 20);
        System.out.println("The maximum is: " + max);

        // Calling a non-static method from the main method
        MethodsDemo methodsDemo = new MethodsDemo();
//        methodsDemo.displayMessage("Hello from the main method!");
        methodsDemo.displayMessage("Hello");
    }

    // Method to print a message
    public static void printMessage()
    {
        System.out.println("Hello, this is a simple method demonstration!");
    }

    // Method to calculate the sum of two integers
    public static int calculateSum(int a, int b)
    {
        return a + b;
//        System.out.println("abc");
    }

    // Method to find the maximum of two integers
    public static int findMax(int x, int y)
    {
        return (x > y) ? x : y;
    }

    public void displayMessage(String message)
    {
        System.out.println("Message: This is non static method called from main method " + message);
    }
}
