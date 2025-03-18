package labs_examples.datastructures.queue.labs;

import java.util.*;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

class QueueController {
    public static void main(String[] args) {
        PriorityQueue<String> myQueue = new PriorityQueue<>();

        myQueue.add("ColdPlay Parachutes");
        myQueue.add("ColdPlay A Rush Of Blood To The Head");
        myQueue.add("ColdPlay X&Y");
        myQueue.add("ColdPlay Viva La Vida Or Death And All His Friends");
        myQueue.add("ColdPlay LeftRightLeftRightLeft");
        myQueue.add("ColdPlay Mylo Xyloto");
        myQueue.add("ColdPlay Ghost Stories");
        myQueue.add("ColdPlay A Head Full Of Dreams");
        myQueue.add("ColdPlay Everyday Life");
        myQueue.add("ColdPlay Music Of The Spheres");
        myQueue.add("ColdPlay Moon Music");
        myQueue.add("ColdPlay Fun Music To The Masses...");

        System.out.println(myQueue.peek());
        System.out.println(myQueue.contains("ColdPlay X&Y"));
        myQueue.remove("ColdPlay Fun Music To The Masses...");
        System.out.println("Size of the Queue is " + myQueue.size());
        System.out.println("Head Of The Queue: " + myQueue.element());
        System.out.println("------------------------------------------");

        for (String coldPlay : myQueue) {
            System.out.println(coldPlay);
        }
        myQueue.clear();
    }
}

/*
 (offer, poll, remove() and add); linear time for the remove(Object) and contains(Object) methods; and constant time for the retrieval methods (peek, element, and size).
 */