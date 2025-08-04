package loops;

public class BreakContinueDemo {
    public static void main(String[] args) {
        // Example of break statement
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking at i = " + i);
                break; // Exit the loop when i is 5
            }
            System.out.println("i = " + i);
        }

        System.out.println("Loop exited due to break statement.");

        // Example of continue statement
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                System.out.println("Continuing at j = " + j);
                continue; // Skip the rest of the loop body when j is 5
            }
            System.out.println("j = " + j);
        }

        System.out.println("Loop exited due to continue statement.");
    }
}
