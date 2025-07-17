public class ComparisonDemo_Karan_Darshanwar {
// File: ComparisonDemo_Karan_Darshanwar.java


        public static void main(String[] args) {
            // Declare and assign values
            int age = 2;
            int experience = 3; // in years
            boolean isCertified = true;


            // Relational operator checks
            boolean isAgeValid = age > 25;
            boolean isExperienceValid = experience > 2;

            System.out.println("Age > 25: " + isAgeValid);
            System.out.println("Experience > 2 years: " + isExperienceValid);

            // Logical operator to check eligibility
            if (isAgeValid && isCertified) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");
            }
        }
    }


