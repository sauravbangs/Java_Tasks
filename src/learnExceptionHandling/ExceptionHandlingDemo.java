package learnExceptionHandling;

public class ExceptionHandlingDemo
{
    public static void main(String[] args)
    {
        // Example of exception handling in Java
        // This code demonstrates how to handle an ArithmeticException when dividing by zero.
        // Runtime exceptions like ArithmeticException can be caught using try-catch blocks.
        System.out.println("Starting exception handling demo...");

        try
        {
            int array[] = {1, 2, 3};
            int result = divide(10, 0);
            System.out.println("Result: " + result);
            System.out.println("Accessing array element: " + array[5]); // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Post array index out of bounds access.");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Attempted to access an invalid array index.");
        }
        catch (Exception e)
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally
        {
            System.out.println("Finally block executed. Execution completed.");
        }
    }

    public static int divide(int a, int b)
    {
        return a / b;
    }
}
