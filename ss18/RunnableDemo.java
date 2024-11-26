package ss18;

public class RunnableDemo implements Runnable {
    private Thread t;
    public final String threadName;
    public RunnableDemo(String name) {
            threadName = name;
            System.out.println("Created" + threadName);
    }

    @Override
    public void run() {

        System.out.println("Running " + threadName);
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
