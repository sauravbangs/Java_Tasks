public class TestSuiteReport_JyotsnaG {
        public static void main(String[] args) {

            for (int suite = 1; suite <= 3; suite++) // 3 test suites
            {
                System.out.println("Suite " + suite + ":");

                for (int tc = 1; tc <= 4; tc++) // bracket not closed as nested loop for 4 tcs

                {
                    System.out.println("  Executing Test Case " + tc);
                }

        }
    }
}
