package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

class MyTopSongs extends Thread {
    public void run() {
        System.out.println("My top songs are playing....");
    }

    public static void main(String[] args) {
        MyTopSongs songsThread = new MyTopSongs();
        songsThread.start();
    }
}