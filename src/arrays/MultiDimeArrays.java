package arrays;

public class MultiDimeArrays {
    public static void main(String[] args) {

//        int marks[][] = new int[2][2];
//        marks[0][0] = 22;
//        marks[0][1] = 33;
//        marks[1][1] = 44;
//        marks[1][1] = 55;
//        marks[1][2] = 65;

        //another way of declaring and initializing a multi dim array.
        // Multi dim also called as array of arrays.

//        int marks[][] =
//                {
//                {22,33},
//                {44,55}
//        };


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        //print elements using for loop
        System.out.println("Printing matrix using for loop:");
        // Outer loop iterates through each row (which is an array)
        for (int i = 0; i < matrix.length; i++) {
            // Inner loop iterates through each element within the current row
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }

//
//                System.out.println("Printing matrix using nested for-each loops:");
//                // Outer loop iterates through each row (which is an array)
//                for (int[] row : matrix)
//                {
//                    // Inner loop iterates through each element within the current row
//                    for (int element : row)
//                    {
//                        System.out.print(element + " ");
//                    }
//                    System.out.println(); // Move to the next line after printing a row
//                }
//            }
    }

}

