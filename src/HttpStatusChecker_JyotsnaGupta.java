import java.util.Scanner;

public class HttpStatusChecker_JyotsnaGupta
{
    public static void main(String[] args)

    {
        // taking inputs from the system

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter HTTPS Status Code");
        int statusCode = scanner.nextInt();

        switch (statusCode) {
            case 200:
                System.out.println("OK – The request was successful");
                break;
            case 400:
                System.out.println("Bad Request – The server could not understand the request");
                break;
            case 401:
                System.out.println("Unauthorized – Authentication is required");
                break;
            case 403:
                System.out.println("Forbidden – You do not have permission");
                break;
            case 404:
                System.out.println("Not Found – The resource could not be found");
                break;
            case 500:
                System.out.println("Internal Server Error – Something went wrong on the server");
                break;
            default:
                System.out.println("Unknown status code");
        }
        scanner.close();

    }
}

