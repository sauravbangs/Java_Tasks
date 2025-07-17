public class BugSeverity_Karan_Darshanwar {

    public static void main (String[] args){
    int bugcount = 5;
    boolean productionissue= false;

    if ( bugcount>10 && productionissue==true){
        System.out.println(" High Severity ");
    } else if (bugcount > 10 && productionissue == false) {

        System.out.println("medium severity");
    }
    else {
        System.out.println("low severity");
    }
    }
}
