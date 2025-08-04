package loops;

public class NestedLoops {

    public static void main(String[] args) {
        outerLoop: //labeled loop used to break/continue from a particular loop
        for (int i = 1; i < 6; i++) {
            System.out.println();
            for (int j = 1; j < 6; j++)
            {
                System.out.println("j= "+j);
                if (j >= 3) {
                    break outerLoop;
                }

            }
//            System.out.println(j);

        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }




    }
}
