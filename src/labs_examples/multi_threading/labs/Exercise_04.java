package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
// synchronized method
class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

class SyncMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    counter.increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    counter.increment();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count " + counter.count);
    }
}
// synchronized block
class SyncBlockDemo {
    public static void main(String[] args) {
        CounterDemo c = new CounterDemo();

        Thread t1 = new Thread((Runnable) c);
        Thread t2 = new Thread((Runnable) c);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(c.getCounter());
    }
}

class CounterDemo implements Runnable {

    private int counter;
    @Override
    public void run() {
        for(int i = 1; i <= 100; i++) {
            increment();
            }
        }

        private void increment() {
        String n = Thread.currentThread().getName();
            System.out.println(n);
            synchronized (n) {
                counter++;
            }
        }

        public int getCounter() {
            return counter;
    }
}