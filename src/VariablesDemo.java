public class VariablesDemo {
    public static void main(String[] args) {
        // Variables: a resusable container for a value

        //Types;
        //Primitive: holds a simple value directly stored in a memory(stack)
        //Reference: holds a memory address that points to the heap

        // Primitive  vs Reference
        // ---------     ----------
        // int           string
        //double         array
        //char           object
        //boolean
        //float
        //byte
        //long
        //short



        //Steps to create a variable
        // 1. declaration
        // 2. assignment

        int year = 2025;
        byte age = 25;  //contains value from -128 to 127 Mostly used for memory saving.

       // System.out.println("The year is " +  year);
        System.out.println(age);

        //implicit (direct/widening) conversion

        /*
              byte -> short -> int -> long -> double
              char -> int -> float -> boolean
              int -> double
              long -> double
              float -> double
              long -> float

         */

        long num1 = 1000;
       // int lingNum1 = num1; // num1 converted to long implicitly

        //explicit conversion
        long num2 = 2000;
        //typecasting
        int num2Int = (int)num2; //num2 converted to int from long explicitly. This can lead to data loss







    }
}
