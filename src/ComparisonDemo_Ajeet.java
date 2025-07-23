public class ComparisonDemo_Ajeet {
    public static void main(String[] args) {
        int age=26;
        int experience=2;
        boolean isCertified=true;

        boolean isAgeEligible = age > 25;
        boolean isExperienceEligible = experience > 2;

        System.out.println("Age > 25: " + isAgeEligible);
        System.out.println("Experience > 2: " + isExperienceEligible);
        if (isAgeEligible && isCertified) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");


        }

    }
}
