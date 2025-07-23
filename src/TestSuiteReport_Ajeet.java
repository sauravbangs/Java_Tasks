public class TestSuiteReport_Ajeet {
    public static void main(String[] args) {
        for (int suite = 1; suite <= 3; suite++) {
            System.out.println("Suite " + suite + ":");

            // Inner loop for test cases
            for (int testCase = 1; testCase <= 4; testCase++) {
                System.out.println("  Executing Test Case " + testCase);
            }

            System.out.println();
        }
    }


}
