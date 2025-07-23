import java.util.Scanner;
public class LoginValidation_Ajeet {
    public static void main(String[] args) {
        // Predefined credentials
        String correctUsername = "ajeet";
        String correctPassword = "111111";

        Scanner scanner = new Scanner(System.in);

        // Take Username input
        System.out.print("Username: ");
        String inputUsername = scanner.nextLine();

        // Take password input
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

        // Validation logic
        if (!inputUsername.equals(correctUsername)) {
            System.out.println("Invalid username");
        } else if (!inputPassword.equals(correctPassword)) {
            System.out.println("Invalid password");
        } else {
            System.out.println("Login successful");
        }

        scanner.close();
    }

}
