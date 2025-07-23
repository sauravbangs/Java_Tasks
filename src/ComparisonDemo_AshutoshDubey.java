public class ComparisonDemo_AshutoshDubey {

    public static void main(String[] args) {
        int age = 28;
        int experience = 4;
        boolean isCertified = true;


        if(age > 25 && experience > 2) {
            System.out.println("Age above 25 ");
            System.out.println("Experience more than 2 years ");
        } else {
            System.out.println("Age is not above 25 and experience is less than 2 years.");
        }


        if(age > 25 && isCertified) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }
}
