public class HttpStatusChecker_AshutoshDubey
{
    public static void main(String[] args) {
        int statusCode = 500;

        switch(statusCode) {
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
                System.out.println("Unknown Status Code");
                break;
        }
    }
}


