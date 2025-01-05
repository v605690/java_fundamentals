package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class OlympicRelayRaceEvent implements Runnable {
    private final String name;
    private final int delay;

    OlympicRelayRaceEvent(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    public OlympicRelayRaceEvent() {

        name = "";
        delay = 0;
    }

    @Override
    public void run() {
        System.out.println(name + " is running...");
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            System.out.println(name + " was interrupted!");
        }
        System.out.println(name + " has finished their part of the race.");
    }

    public static void main(String[] args) {
        OlympicRelayRaceEvent olympian1 = new OlympicRelayRaceEvent("Andrew", 3000);
        OlympicRelayRaceEvent olympian2 = new OlympicRelayRaceEvent("Usain", 2000);
        OlympicRelayRaceEvent olympian3 = new OlympicRelayRaceEvent("Michael", 1500);

        Thread thread1 = new Thread(olympian1);
        Thread thread2 = new Thread(olympian2);
        Thread thread3 = new Thread(olympian3);
        Thread thread4 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("James is running...oh his out of the race, looks like his hurt...");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

