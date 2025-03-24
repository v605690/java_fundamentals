package labs_examples.datastructures.hashmap.labs;

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

    public int size() {
        int count = 0;

        if (head == null) {
            return count;
        }

        Node iter = head;
        count++;

        while (iter.next != null) {
            iter = iter.next;
            count++;
        }
        return count;
    }

    public boolean printList() {
        Node<P> newNode = head;
        while (newNode != null) {
            System.out.println(newNode.item);
            newNode = newNode.next;
        }
        return false;
    }
}

