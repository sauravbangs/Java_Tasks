public class Highest_Number_Karan_Darshanwar {
    public static void main(String[] args) {

        int[] scores = {78, 85, 90, 66, 95, 88};

        // Using regular for loop
        int maxScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
            }
        }

        System.out.println("\nHighest score using regular for loop: " + maxScore);

        // Using enhanced for loop
        maxScore = scores[0];
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
        }

        System.out.println("Highest score using enhanced for loop: " + maxScore);
    }
}
