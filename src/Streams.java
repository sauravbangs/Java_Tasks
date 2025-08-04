import java.util.Arrays;
// Streams are a part of the Java Collections Framework and provide a functional approach to
// processing sequences of elements.
public class Streams
{
    public static void main(String[] args) {
        // Streams are used to process collections of objects.
        // They can be used to perform operations like filtering, mapping, and reducing.
        // Streams can be created from collections, arrays, or I/O channels.

        // Example of creating a stream from an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Using streams to filter and print even numbers
//        System.out.println("Even numbers:");
//        Arrays.stream(numbers)
//              .filter(n -> n % 2 == 0)
//              .forEach(System.out::println);

        // Iterating through the array using for-each loop
        int sum = 0;
        for(int arrayNum :numbers)
        {
            System.out.println(arrayNum);
            sum += arrayNum;
        }

        // Using streams to calculate the sum of the numbers
        sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers: " + sum);

        // Using streams to find the maximum number
        int max = Arrays.stream(numbers).max().orElseThrow();
        System.out.println("Maximum number: " + max);

        // Using streams to find the average of the numbers
        double average = Arrays.stream(numbers).average().orElseThrow();
        System.out.println("Average of numbers: " + average);

        // Using streams to count the number of elements
        long count = Arrays.stream(numbers).count();
        System.out.println("Count of numbers: " + count);
    }
}
