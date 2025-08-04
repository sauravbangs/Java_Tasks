import java.util.Scanner;

public class TakeUserInput {
    public static void main(String[] args) {
        //Scanner class
        //Scanner is a class in java.util package.
        //It is used to take input from the user.
        //It can take input from various sources like keyboard, file, etc.
        //It can take input of various data types like int, float, double, String, etc.
        //It has various methods to take input like nextInt(), nextFloat(),
        // nextDouble(), nextLine(), next(), etc.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        //String name = sc.next(); reads the input without spaces. Anything after space will not be takes as input.
        String name = sc.nextLine(); //reads the input with spaces
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
        sc.close();
    }
}
