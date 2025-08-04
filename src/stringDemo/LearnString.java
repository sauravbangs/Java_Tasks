package stringDemo;

public class LearnString
{
    public static void main(String[] args)
    {
         //char name[] = {'J', 'A', 'V', 'A'};
         String name = "JAVA";
         String name1 = "DotNet";
         String combine = name+name1;
         String x = combine.toUpperCase();
        // Creating a string using string literal
        String str1 = "Hello, World!";
        System.out.println("String using literal: " + str1);

        // Creating a string using the new keyword
        String str2 = new String("Hello, Java!");
        String str3 = new String("Hello, Java!");


        System.out.println("String using new keyword: " + str2);

        // Concatenating strings
        //String str3 = str1 + " " + str2;
        System.out.println("Concatenated string: " + str3);

        // Finding the length of a string
        int length = str3.length();
        System.out.println("Length of the concatenated string: " + length);

        // Converting to uppercase
        String upperStr = str3.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);
//
//        // Converting to lowercase
//        String lowerStr = str3.toLowerCase();
//        System.out.println("Lowercase string: " + lowerStr);
//
//        // Checking if a string contains a substring
//        boolean contains = str3.contains("Java");
//        System.out.println("Does the concatenated string contain 'Java'? " + contains);

//        String strDemo = "Test String";
//        strDemo.
//

        // valueof() method
//        int num = 100;
//        String strNum = String.valueOf(num);
//        System.out.println("String representation of number: " + strNum);

        //equals() method and equalsIgnoreCase() method
//        String str1 = "Hello";
//        String str2 = "hello";

        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Are the strings equal? " + isEqual);
        System.out.println("Are the strings equal (ignoring case)? " + isEqualIgnoreCase);

    }

}
