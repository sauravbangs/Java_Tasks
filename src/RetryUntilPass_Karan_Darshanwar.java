

public class RetryUntilPass_Karan_Darshanwar {
    public static void main(String[] args) {
        int attempt = 1;
        int number = 0;

        // Retry until random number becomes 5
        while (number != 5) {
            number = (int)(Math.random() * 10) + 1;  // Generates number between 1 and 10
            System.out.println("Attempt #" + attempt + ": Generated number = " + number);
            attempt++;
        }

        System.out.println("Pass condition met Random number is 5.");
    }
}
