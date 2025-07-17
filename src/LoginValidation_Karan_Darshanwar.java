import java.util.Scanner;

public class LoginValidation_Karan_Darshanwar
{
    public static void main(String[] args) {
        // Predefined username and password
        String Username = "karan";
        String Password = "Karan123";

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Validation logic
        if (inputUsername.equals(Username) && inputPassword.equals(Password)) {
            System.out.println("Login successful");
        } else if (!inputUsername.equals(Username)) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Invalid password");
        }

        // Close scanner

    }
}
