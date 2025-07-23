public class Array_Karan_Darshanwar {
    public static void main(String[] args) {
        // Task 1: Count passed and failed test cases
        String[] testStatuses = {"Pass", "Fail", "Pass", "Fail", "Pass"};

        int passCount = 0;
        int failCount = 0;

        // Using regular for loop
        for (int i = 0; i < testStatuses.length; i++) {
            if (testStatuses[i].equalsIgnoreCase("Pass")) {
                passCount++;
            } else if (testStatuses[i].equalsIgnoreCase("Fail")) {
                failCount++;
            }
        }

        System.out.println("Using regular for loop:");
        System.out.println("Passed: " + passCount);
        System.out.println("Failed: " + failCount);

        // Reset counters and use enhanced for loop
        passCount = 0;
        failCount = 0;

        for (String status : testStatuses) {
            if (status.equalsIgnoreCase("Pass")) {
                passCount++;
            } else if (status.equalsIgnoreCase("Fail")) {
                failCount++;
            }
        }

        System.out.println("\nUsing enhanced for loop:");
        System.out.println("Passed: " + passCount);
        System.out.println("Failed: " + failCount);


    }
}
