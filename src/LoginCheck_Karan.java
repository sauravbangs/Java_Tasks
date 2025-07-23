public class LoginCheck_Karan {

    // Method to validate login credentials
    public static boolean validateLogin(String username, String password) {
        // Hardcoded valid credentials
        String validUsername = "admin";
        String validPassword = "password123";

        return username.equals(validUsername) && password.equals(validPassword);
    }

    public static void main(String[] args) {
        // Sample input
        String inputUsername = "admin";
        String inputPassword = "password123";

        // Call the method and check result
        boolean loginResult = validateLogin(inputUsername, inputPassword);

        if (loginResult) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
