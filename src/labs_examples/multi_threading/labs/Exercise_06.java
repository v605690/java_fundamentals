package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */

class NumberGroup {
    private static int minNum = 1;
    private static int maxNum = 100;
    public static void main(String[] args) {

        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (minNum <= maxNum) {
                    synchronized (NumberGroup.class) {
                        if (minNum % 2 == 0) {
                            System.out.println(Thread.currentThread().getName() + ": " + minNum);
                            minNum++;
                        }
                    }
                }
            }
        }, "Even Thread");

        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (minNum <= maxNum) {
                    synchronized (NumberGroup.class) {
                        if (minNum % 2 != 0) {
                            System.out.println(Thread.currentThread().getName() + ": " + minNum);
                            minNum++;
                        }
                    }
                }
            }
        }, "Odd Thread");

        evenThread.start();
        oddThread.start();
    }
}