public class BugSeverity_AshutoshDubey {

    public static void main(String[] args) {
        int bugCount = 15;
        boolean isProductionIssue = true;

        if (bugCount > 10 && isProductionIssue) {
            System.out.println("High Severity");
        } else if (bugCount > 10 && !isProductionIssue) {
            System.out.println("Medium Severity");
        } else {
            System.out.println("Low Severity");
        }
    }
}
