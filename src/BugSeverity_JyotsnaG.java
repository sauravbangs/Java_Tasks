import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class BugSeverity_JyotsnaG {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        {
            // Enter the input
            System.out.print("Enter the value of bug count - ");
            int bugCount = scanner.nextInt();

            // Enter the input
            System.out.print("Is it a production issue? (true/false): ");
            boolean isProductionIssue = scanner.nextBoolean();

            //declare variable
            //  int bugCount=8;
            //  boolean isProductionIssue = true;
            //Write Logic:
            if (bugCount > 10 && isProductionIssue)
            {
                System.out.println("High Severity");
            }
            else if (bugCount > 10 && !isProductionIssue)
            {
                System.out.println("Medium Severity");
            } else {
                System.out.println("Low Severity");
            }
            scanner.close();

        }
    }
}