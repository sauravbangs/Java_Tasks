package collectionFramework.LearnList;

import java.util.Arrays;

public class ArrayClass
{
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {50,90,10,40}; //array size is 4
        System.out.println("Length of the array: " + numbers.length); // Get the length
        // sort the array in ascending order
        Arrays.sort(numbers);
        Arrays.fill(numbers, 0); // Fill the array with zeros
        //compare the arrays
        int[] numbers2 = {50,90,10,40};
        boolean areEqual = Arrays.equals(numbers, numbers2);
        System.out.println("Are the two arrays equal? " + areEqual);

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }



    }
}
