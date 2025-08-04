package conditionalStatements;

public class SwtichStatement {
    public static void main(String[] args) {
        int day = 3; // Example day of the week (1-7)

        // Using switch statement to determine the day of the week
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
//        }
//

        // The switch statement is used to execute one block of code among many based on the value of a variable.
// It is often used as an alternative to multiple if-else statements when dealing with a single variable that can take on multiple discrete values.
// The switch statement can improve code readability and maintainability, especially when dealing with many conditions.
// Each case in the switch statement corresponds to a specific value of the variable being evaluated.
// The break statement is used to exit the switch block after a case is executed. If break is omitted, the program will continue executing the next case (this is called "fall-through").
// The default case is executed if none of the specified cases match the variable's value. It is optional but recommended to handle unexpected values.
// Switch statements can be used with various data types, including integers, characters, and strings (in Java 7 and later).
// Note: In Java, switch statements can also be used with strings, which allows for more flexible and readable code when dealing with string values.
// Example of a switch statement with a string variableString command = "start";
        String command = "start";
        String actionMessage;
//        if (command.equals("start")) {
//            actionMessage = "Starting the system...";
//        } else if (command.equals("stop")) {
//            actionMessage = "Stopping the system...";
//        } else if (command.equals("restart")) {
//            actionMessage = "Restarting the system...";
//        } else if (command.equals("status")) {
//            actionMessage = "Checking system status...";
//        } else {
//            actionMessage = "Unknown command. Please use 'start', 'stop', 'restart', or 'status'.";
//        }
//        System.out.println(actionMessage);

        switch (command) {
            case "start":
                System.out.println("Starting the system...");
                System.out.println("System started successfully.");
                break;
            case "stop":
                System.out.println("Stopping the system...");
                break;
            case "restart":
                System.out.println("Restarting the system...");
                break;
            case "status":
                System.out.println("Checking system status...");
                break;
            default:
                System.out.println("Unknown command. Please use 'start', 'stop', 'restart', or 'status'.");
        }
    }
}