public class AnonymousClass
{
    public static void main(String[] args)
    {
        // Creating an anonymous class that implements Runnable
        Runnable runnable = new Runnable()
        {
            @Override
            public void run() {
                System.out.println("Running in an anonymous class");
            }
        };

        // Starting a thread with the anonymous class
        Thread thread = new Thread(runnable);
        thread.start();

        // Creating another anonymous class that extends a class
        Object obj = new Object()
        {
            @Override
            public String toString()
            {
                return "This is an anonymous class extending Object";
            }
        };

        System.out.println(obj.toString());
    }
}
