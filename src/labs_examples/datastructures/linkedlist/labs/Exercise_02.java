package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Write your own custom LinkedList class. Although it can mimic the CustomLinkedList
 *      class we used here, it must be entirely unique. Please also add at least two
 *      additional helper methods that you think could be useful. Refer to Java's built-in
 *      LinkedList class for inspiration. Your new LinkedList class should ONLY allow users
 *      to add and remove elements from the front of the list AND the end of the list.
 */

class MyCustomLinkedList<P> {
    private Node<P> head;
    private Node<P> tail;

    static class Node<P> {
        P item;
        Node<P> next;

        public Node(P item) {
            this.item = item;
            this.next = null;
        }

        public Node(P item, Node<P> next) {
            this.item = item;
            this.next = next;
        }
    }

    public void addFirst(P item) {
        Node<P> newNode = new Node(item);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }
    }

    public void addlast(P item) {
        if (tail == null) {
            addFirst(item);
            return;
        }

        Node<P> newNode = new Node<P>(item);
        tail.next = newNode;
        tail = newNode;
    }

    public void remove(P item) {
        if (head == null) {
            return;
        }
        if (head.item == item) {
            head = head.next;
        } else {
            Node<P> current = head;
            while (current.next != null && !(current.next.item == item)) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }
    public void printList() {
        Node<P> newNode = head;
        while (newNode != null) {
            System.out.println(newNode.item);
            newNode = newNode.next;
        }
    }
}

class LinkListController {
    public static void main(String[] args) {
        MyCustomLinkedList<String> myLinkList = new MyCustomLinkedList<>();

        myLinkList.addFirst("paint");
        myLinkList.addFirst("brush");
        myLinkList.addlast("tarp");
        myLinkList.printList();
        System.out.println();
        myLinkList.remove("paint");
        myLinkList.printList();

    }
}