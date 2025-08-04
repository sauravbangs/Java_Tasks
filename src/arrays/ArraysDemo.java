package arrays;
import oopsConcept.*; // Importing the Car class from oopsConcept package
import java.util.Arrays;

//arrays are whwre data is stored in the form of list.
// It is a part of DS and most commonly used.
// It is a collection of similar data types.
// arrays are stored in contiguous memory locations.

public class ArraysDemo {
    public static void main(String[] args)
    {
        int arrayAges[] = new int[5];
        arrayAges[0] = 21;
        arrayAges[1] = 13;
        arrayAges[2] = 14;
        arrayAges[3] = 5;
        arrayAges[4] = 60;

        int sum = 0;
        int arrLength = arrayAges.length;

        // Iterating through the array using for loop
        System.out.println("Iterating through the array using for loop:");
//        for(int i = 0; i < arrLength; i++)
//        {
//            System.out.println(arrayAges[i]);
//           // sum += arrayAges[i];
//
//        }

        // Iterating through the array using for-each loop
        for(int arrayAge:arrayAges){
            System.out.println(arrayAge);
            //sum+=arrayAge;
//            sum = sum+arrayAge;

        }

//        System.out.println("Length of the array is " + arrLength);
//        System.out.println("Sum of ages = " + sum);
//        int newArrayAges[] =  arrayAges.clone();
//        for(int newArrayAge:newArrayAges){
//            System.out.println("cloned array " + newArrayAge);
//        }

//        System.out.println("Average age" + Arrays.stream(arrayAges).average());



    }

}
