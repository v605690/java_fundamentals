package labs_examples.datastructures.queue.labs;

import java.util.Arrays;
import java.util.Objects;

import static java.util.Locale.filter;

/**
 *      Queues - Exercise_02
 *
 *      Write a new custom (Generic) Queue class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Queue class must also do the following:
 *
 *      1) throw a custom exception when trying to pop  an element from an empty Queue
 *      2) resize the Queue (the underlying array) to be twice the size when the Queue is more than 3/4 full
 *      3) resize the Queue (the underlying array) to be half the size when the Queue is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Queue
 *
 */

@SuppressWarnings("ALL")
class GenericQueue<P> {
    private P[] array;
    private int first;
    private int end;
    private int size;

    public GenericQueue(int size) {
        this.array = (P[]) new Object[size];
        this.first = first;
        this.end = end;
        this.size = size;
    }

    public int size() {
        return array.length;
    }

    public int capacity() {
        return array.length;
    }

    public void resize(int newSize) {
        array = Arrays.copyOf(array, newSize);
    }

    public P peakFirst() {
        return array[first];
    }

    public P peakLast() {
        return array[--end];
    }

    public void add(P item) {
        array[++end] = item;
    }

    public P enQueue(P item) {
        array[end] = item;
        end = (end + 1) % array.length;
        size++;

        if (size < array.length * 0.25) {
            resize(capacity());
        } else {
            if (size > array.length * .75) {
                resize(array.length * 2);
            }
        }
        return item;
    }

    public P dequeue() {
        P item = array[first];
        first = (first + 1) % array.length;
        size--;
        return item;
    }

    public void printQueue() {
        int i = 0;
        for (P str : array) {
            if (str != null) {
                System.out.println(i++ + " " + str);
            }
        }
    }
}


class GenericQueueController {
    public static void main(String[] args) {
        GenericQueue<String> arr = new GenericQueue<>(10);

        arr.enQueue("Water");
        arr.enQueue("Milk");
        arr.enQueue("Bread");
        arr.enQueue("Chicken");
        arr.enQueue("pasta");
        arr.enQueue("Orange Juice");
        arr.enQueue("Butter");
        arr.enQueue("Bacon");
        arr.enQueue("Eggs");
        arr.enQueue("Sausage");
        arr.enQueue("Pancake Flour");
        arr.enQueue("Potatoes");
        arr.enQueue("Syrup");

        System.out.println("---------------------------------");
        arr.printQueue();
        System.out.println("---------------------------------");
        System.out.println(arr.size());
        System.out.println("---------------------------------");
        System.out.println(arr.peakFirst());
        System.out.println("---------------------------------");
        System.out.println(arr.peakLast());
        System.out.println("---------------------------------");
        System.out.println(arr.dequeue());
    }
}