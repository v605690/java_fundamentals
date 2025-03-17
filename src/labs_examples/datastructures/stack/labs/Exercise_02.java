package labs_examples.datastructures.stack.labs;

/**
 *      Stacks - Exercise_02
 *
 *      Write a new custom (Generic) Stack class that uses a traditional Array as the underlying data structure
 *      rather than the LinkedList as in the example we have already seen.
 *
 *      Your custom Stack class must also do the following: (Ryan Take 2)
 *
 *      1) throw a custom exception when trying to pop an element from an empty Stack
 *      2) resize the Stack (the underlying array) to be twice the size when the Stack is more than 3/4 full
 *      3) resize the Stack (the underlying array) to be half the size when the Stack is more than 1/4 empty
 *      4) contain the methods peekFirst() and peekLast()
 *      5) contain a size() method
 *      6) contain a method to print out the data of all elements in the Stack
 *
 *      TIP: To initialize a new array of a Generic type you can use this:
 *           T[] data = (T[]) new Object[10];
 */

class StackArrayDemo<P> {
    private P[] array;
    private int first;
    private int capacity;

    public StackArrayDemo(int capacity) {
        this.capacity = capacity;
        this.array = (P[]) new Object[capacity];
        this.first = 0;
    }

    public void push(P item) {
        array[++first] = item;
    }

    public P pop() {
        first = first -1;
        // --first / first-- are different
        return array[first];
    }

    public int size() {
        return array.length;
    }

    public P peakFirst() {
        return array[first];
    }

    public P peakLast() {
        return array[--first];
    }

    public void printArray() {
//        for (P item : array) {
//            System.out.println(item + " ");
//        }
        for (int i = 0; i < first; i++) {
            System.out.println(i + " " + array[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        StackArrayDemo<String> arr = new StackArrayDemo(10);

        arr.push("resins");
        arr.push("walnuts");
        arr.push("pistachios");
        arr.push("almonds");
        arr.push("pecans");
        arr.push("cashews");

        System.out.println(arr.peakFirst());
        System.out.println(arr.peakLast());
        System.out.println();
        System.out.println(arr.pop());
        arr.printArray();
        System.out.println(arr.pop());
        arr.printArray();
        System.out.println(arr.pop());
         int d = 5;
        System.out.println(d++);
        System.out.println(d);
        System.out.println(++d);
        System.out.println(arr.size());
    }
}


