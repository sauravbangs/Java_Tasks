public class TestSummary_Karan {

    // Method to get total number of test cases
    public static int getTotalTests(int passed, int failed, int skipped) {
        return passed + failed + skipped;
    }

    public static void main(String[] args) {
        // Sample values
        int passed = 5;
        int failed = 2;
        int skipped = 1;

        // Call the method and store result
        int totalTests = getTotalTests(passed, failed, skipped);

        // Print the total
        System.out.println("Total number of test cases: " + totalTests);
    }
}
