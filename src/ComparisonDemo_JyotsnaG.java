import java.util.Scanner;

public class ComparisonDemo_JyotsnaG {
    public static void main(String[] args) {

        //Declares variables for age, experience, and isCertified.
        int age;
        float experience;
        char isCertified;

        Scanner scanner = new Scanner(System.in);
        // Enter the age
        System.out.println("Enter the age");
        age = scanner.nextInt();
        System.out.println("Enter the experience");
        experience = scanner.nextInt();
        System.out.println("Is it certified Y/N");
        isCertified = (char) scanner.nextInt();

        //Use relational operators to check if age is above 25 and experience is more than 2 years.

        if (age>25 && experience>2) {
            System.out.println("Eligible");
        }
            else
        {if(age > 25 && isCertified=='Y') {
            System.out.println( "Certified");}
        }
  //      else {
        //         System.out.println("Out of case");
   //     }


    }
}
