package labs_examples.multi_threading.labs;

import javax.xml.namespace.QName;

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
    Thread thread;
    private int priority;

    OlympicRelayRaceEvent(String name, int delay) {
        this.name = name;
        this.delay = delay;

        thread = new Thread(this, name);
        thread.start();
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

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}

class OlympicController {
public static void main(String[] args) {
        OlympicRelayRaceEvent olympian1 = new OlympicRelayRaceEvent("Andrew", 3000);
        OlympicRelayRaceEvent olympian2 = new OlympicRelayRaceEvent("Usain", 2000);
        OlympicRelayRaceEvent olympian3 = new OlympicRelayRaceEvent("Michael", 1500);

        Thread.currentThread().setPriority(10);
        olympian2.setPriority(6);

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("James is running...Oh wait, looks like his hurt and his out of the race.");
            }
        });
        thread2.start();
    }
}

