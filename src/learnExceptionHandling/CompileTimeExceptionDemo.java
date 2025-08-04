package learnExceptionHandling;

public class CompileTimeExceptionDemo
{
    // This class demonstrates compile-time exceptions in Java.
    // IOExceptions are a common example of compile-time exceptions that must be handled or declared in the method signature.
    public static void main(String[] args)
    {
        // Example of compile-time exceptions in Java
        // This code demonstrates how to handle compile-time exceptions like IOException.
        // Compile-time exceptions must be declared or handled using try-catch blocks.
        System.out.println("Starting compile-time exception demo...");

        try
        {
            readFile("example.txt");
        }
        catch (java.io.IOException e)
        {
            System.out.println("Error: Unable to read the file. " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws java.io.IOException {
        // Simulating a method that throws a compile-time exception
        throw new java.io.IOException("File not found: " + fileName);
    }
}
