public class StringFormatter_Karan {

    public static void main(String[] args) {
        // Original string with extra space
        String message = "Welcome to QA automation! ";

        // Apply formatting
        String trimmed = message.trim(); // Remove extra spaces
        String upper = trimmed.toUpperCase(); // Convert to uppercase
        String formatted = upper.replace("QA", "JAVA"); // Replace "QA" with "JAVA"

        // Print the final result
        System.out.println("Formatted String: " + formatted);
    }
}
