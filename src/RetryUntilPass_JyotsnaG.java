public class RetryUntilPass_JyotsnaG {
    public static void main(String[] args) {
        int randomGenearteNumber;

        while (true) // check the condition of retry
        {
            randomGenearteNumber = (int) ((Math.random() * 10) + 1);

            System.out.println("Generated number: " + randomGenearteNumber);

            if (randomGenearteNumber == 5) //If the number is 5 ( condition check)

            {
                System.out.println("Pass! The number is 5.");
                break; // Exit the loop when the pass condition is met
            } else {
                System.out.println("Retrying...");
            }
        }
    }
}
