package collectionFramework.LearnList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListDemo
{
    /**
     * This is a simple demonstration of the List interface in Java.
     * It shows how to create a list, add elements, remove elements,
     * access elements, and perform some common operations.
     */

    public static void main(String[] args)
    {
        List<Integer> numbers = new Vector<>();

      //
        // ArrayListDemo arr1 = new ArrayListDemo();
        //arr1.


        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(Integer.valueOf(10));

        System.out.println("Numbers in the list: " + numbers);

        numbers.remove(1); // Removes the element at index 1 (20)
        System.out.println("Numbers in the list: " + numbers);

        numbers.remove(Integer.valueOf(10)); // Removes the element 10
        System.out.println("Numbers in the list after removing 10: " + numbers);

//        numbers.re

        int firstNumber = numbers.get(0); // Gets the element at index 0 (10)
        System.out.println("First number in the list: " + firstNumber);
        System.out.println("Size of the list: " + numbers.size());
        System.out.println("Is the list empty? " + numbers.isEmpty());

        numbers.clear(); // Clears the list
        System.out.println("Numbers in the list after clearing: " + numbers);
        System.out.println("Is the list empty after clearing? " + numbers.isEmpty());



        // Example of iterating through the list
        for (Integer number : numbers)
        {
            System.out.println("Number: " + number);
        }

        // Example of checking if a specific element exists in the list
        if (numbers.contains(10)) {
            System.out.println("The list contains the number 10.");
        } else {
            System.out.println("The list does not contain the number 10.");
        }

        // Example of converting the list to an array
        Integer[] numberArray = numbers.toArray(new Integer[0]);
        System.out.println("Numbers in the array: ");
        for (Integer num : numberArray)
        {
            System.out.println(num);
        }

        // Example of sorting the list
        numbers.add(40);
        numbers.add(50);
        numbers.sort(null); // Sorts the list in natural order
        System.out.println("Numbers in the list after sorting: " + numbers);


        // Example of using the indexOf method
        int index = numbers.indexOf(30); // Gets the index of the element 30
        if (index != -1)
        {
            System.out.println("The number 30 is found at index: " + index);
        } else
        {
            System.out.println("The number 30 is not found in the list.");
        }

        // Example of using the lastIndexOf method
        numbers.add(30); // Adding another 30 to demonstrate lastIndexOf
        int lastIndex = numbers.lastIndexOf(30); // Gets the last index of the element 30
        if (lastIndex != -1) {
            System.out.println("The last occurrence of the number 30 is at index: " + lastIndex);
        } else {
            System.out.println("The number 30 is not found in the list.");
        }




    }
}
