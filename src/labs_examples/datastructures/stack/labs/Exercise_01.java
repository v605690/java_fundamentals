package labs_examples.datastructures.stack.labs;

import java.util.LinkedList;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

class CustomStackDemo<P> {
    LinkedList<P> linkedList = new LinkedList();

    public void push(P item) {
        linkedList.addFirst(item);
    }

    public P pop() {
        try {
            return linkedList.removeFirst();
        } catch (NullPointerException e) {
            System.out.println("Exception" + e);
            return null;
        }
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
    public void clear() {
        linkedList.clear();
    }

    public P peek() {
        return linkedList.peek();
    }
}

class StackController {
    public static void main(String[] args) {
        CustomStackDemo<String> cSD = new CustomStackDemo<>();

        cSD.push("Macbook Air M3");
        cSD.push("LG 46 CS Monitor");
        cSD.clear();
        cSD.push("Logic MX Master 2x");
        cSD.push("Neo Ergo Keyboard");
        cSD.push("CalDigit Hub");
        cSD.push("ipad pro");
        System.out.println(cSD.isEmpty());
        System.out.println(cSD.peek());

        while (!cSD.isEmpty()) {
            System.out.print(cSD.pop() + " ");
        }
        System.out.println();
    }
}