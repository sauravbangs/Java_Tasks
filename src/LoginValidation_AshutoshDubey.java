import java.util.Scanner;

public class LoginValidation_AshutoshDubey {

    public static void main(String[] args) {

        String correctUsername = "admin";
        String correctPassword = "password123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Login successful");
        } else if (!inputUsername.equals(correctUsername)) {
            System.out.println("Invalid username");
        } else {
            System.out.println("Invalid password");
        }

    }
}
