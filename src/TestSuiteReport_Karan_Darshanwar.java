
public class TestSuiteReport_Karan_Darshanwar {
    public static void main(String[] args) {
        // Outer loop for 3 test suites
        for (int suite = 1; suite <= 3; suite++) {
            System.out.println("Suite " + suite + ":");

            // Inner loop for 4 test cases per suite
            for (int testCase = 1; testCase <= 4; testCase++) {
                System.out.println("  Executing Test Case " + testCase);
            }

            System.out.println(); // Blank line between suites
        }
    }
}
