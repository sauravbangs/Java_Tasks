public class RetryUntilPass_Ajeet {
    public static void main(String[] args) {
        int i = 1;
        int j=0;

        System.out.println("Retrying until we get number 5 (Pass Condition)...");

        while (i !=5) {
            j=(int)(Math.random() * 10) + 1;
            System.out.println("Attempt " + i + ": Generated number = " + j);
            i++;}

        System.out.println("Pass condition met. Exiting after " + (i - 1) + " attempts.");

    }
}
