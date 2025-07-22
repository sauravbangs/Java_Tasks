import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class HttpStatusChecker_JyotsnaG
{
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the URL ;");
        String urlString = scanner.nextLine();

         URL url = new URL(urlString);
        HttpURLConnection connection = null;
//        try {
//            connection = (HttpURLConnection) url.openConnection();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            connection.setRequestMethod("GET");
//        } catch (ProtocolException e) {
//            throw new RuntimeException(e);
//        }

        int statusCode = connection.getResponseCode();

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
            case  404:
                System.out.println("Not Found – The resource could not be found");
break;
            case 500:
                System.out.println("Internal Server Error – Something went wrong on the server");

        }


    }
}
