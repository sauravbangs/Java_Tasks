public class ApiResponseTime_Karan {

    public static void main(String[] args) {
        // Declare a double variable for response time
        double responseTime = 3.6789;

        // Use Math methods
        long rounded = Math.round(responseTime);       // Nearest whole number
        double ceiling = Math.ceil(responseTime);      // Round up
        double floor = Math.floor(responseTime);       // Round down


        System.out.println("Original Response Time: " + responseTime);
        System.out.println("Rounded (Math.round): " + rounded);
        System.out.println("Rounded Up (Math.ceil): " + ceiling);
        System.out.println("Rounded Down (Math.floor): " + floor);
    }
}
