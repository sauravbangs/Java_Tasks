public class MathTeste_Karan {

    public static void main(String[] args) {
        // Math.max() - find the larger of two test scores
        int score1 = 85;
        int score2 = 92;
        int maxScore = Math.max(score1, score2);
        System.out.println("Higher Test Score (Math.max): " + maxScore);

        // Math.min() - find the lower response time between two APIs
        double api1Time = 3.6;
        double api2Time = 4.2;
        double minTime = Math.min(api1Time, api2Time);
        System.out.println("Lower API Response Time (Math.min): " + minTime);

        // Math.abs() - absolute value for positive and negative numbers
        int pos = 15;
        int neg = -20;
        System.out.println("Absolute of " + pos + " (Math.abs): " + Math.abs(pos));
        System.out.println("Absolute of " + neg + " (Math.abs): " + Math.abs(neg));

        // Math.random() - generate random number between 10 and 20
        int randomNum = (int)(Math.random() * 11) + 10; // (0–10) + 10 => 10–20
        System.out.println("Random number between 10-20 (Math.random): " + randomNum);
    }
}
