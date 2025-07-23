public class ComparisonDemo_Jyotsna {

        public static void main(String[] args)
        {
            int age = 28;
            int experience = 3;
            boolean isCertified = true;

            boolean checkAge = age > 25;
            boolean chekExperience = experience > 2;

            // Print relational comparison results
            System.out.println("Age > 25: " + checkAge);
            System.out.println("Experience > 2 years: " + chekExperience);

            // logical operators
            if (age > 25 && isCertified) {

                System.out.println("Eligible");
            } else {
                System.out.println("Not eligible");

        }
    }
}
