package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

/*
Not too sure on wait() and notify()
 */
class WaitNotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Stage 1 complete");
        synchronized (args) {
            System.out.println("Stage 2 complete");
            args.notify();
            System.out.println("Please wait....");
            args.wait(1000);
            System.out.println("Stage 3 complete");
            System.out.println("All stages are now complete!!");
        }
    }
}
