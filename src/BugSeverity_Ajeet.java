public class BugSeverity_Ajeet {
    public static void main(String[] args) {
        // Declare BugSeverity details
        int bugcount=11;
        boolean isProductionIssue=false;
        // Determine and print bug severity

        if (bugcount > 10 && isProductionIssue) {
            System.out.println("High Severity");
        } else if (bugcount > 10 && !isProductionIssue) {
            System.out.println("Medium Severity");
        } else {
            System.out.println("Low Severity");
        }

    }
}
