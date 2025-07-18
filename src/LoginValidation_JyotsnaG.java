import java.util.Scanner;

public class LoginValidation_JyotsnaG {
    public static void main(String[] args) {
        String username = "BOLD";
        String password = "QWERTY";
// input from keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String inusername = scanner.nextLine();

        System.out.print("Enter Password :");
        String inpassword = scanner.nextLine();

        // match the condition

      // if (username == inusername && password == inpassword) {
       // System.out.print("Login Successful");
       // } else {
       //     System.out.print("Login Failed");
       // }

        if(!inusername.equals(username)) {
            System.out.println("Invaid username");
        } else if (!inpassword.equals(password))
        { System.out.println("Invaid Password");
        } else {
            System.out.println("Login Successful");
        }
        scanner.close();
    }
}