package LinkedList;

public class Node<T> {

    T data;
    Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    // overloading constructor
    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }
}
