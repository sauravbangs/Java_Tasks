public class EmailValidator_Karan {

    public static void main(String[] args) {
        // Define the email to validate
        String email = "qa.team@bold.com";

        // Check for "@" and ".com"
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
