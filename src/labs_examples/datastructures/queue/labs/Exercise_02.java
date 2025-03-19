package labs_examples.datastructures.queue.labs;

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

    public P peakFirst() {
        return array[first];
    }

    public P peakLast() {
        return array[--end];
    }

    public void add(P item) {
        array[++end] = item;
    }

    public void enQueue(P item) {
        array[end] = item;
        end = (end + 1) % array.length;
        size++;
    }

    public P dequeue() {
        P item = array[first];
        first = (first + 1) % array.length;
        size--;
        return item;
    }

    public void printQueue() {
            for (int i = first; i <= end; i++) {
                System.out.println(i + " " + array[i]);
            }
            System.out.println(end);

    }

}


class GenericQueueController {
    public static void main(String[] args) {
        GenericQueue<String> arr = new GenericQueue<>(10);

        arr.add("Water");
        arr.add("Milk");
        arr.add("Bread");
        arr.add("Chicken");
        arr.add("pasta");
        //arr.printArray();
        System.out.println("---------------------------------");
        arr.enQueue("Orange Juice");
        arr.enQueue("Butter");
        arr.printQueue();
        System.out.println(arr.size());
        System.out.println(arr.peakFirst());
        System.out.println(arr.peakLast());
        System.out.println(arr.dequeue());
    }
}