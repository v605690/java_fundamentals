package labs_examples.datastructures.linkedlist.labs;

/**
 *      LinkedLists - Exercise_02
 *
 *      Please create your own custom doubly-LinkedList from start to finish :) You got this!
 */
class DoublyLinkedList<P> {
    private Node head;
    private Node tail;

    class Node<P> {
        P item;
        Node prev;
        Node next;

        public Node(P item, Node prev, Node next) {
            this.item = item;
            this.prev = null;
            this.next = null;
        }

        public Node(P item) {
            this.item = item;
            this.next = null;
        }
    }

        public void forward() {
            Node newNode = head;
            while (newNode != null) {
                System.out.println(newNode.item + " ");
                newNode = newNode.next;
            }
        }

        public void reverse() {
            Node newNode = tail;
            while (newNode != null) {
                System.out.println(newNode.item + " ");
                newNode = newNode.prev;
            }
        }
        public void addFirst(P item) {
            Node newNode = new Node(item);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
        }
    }
}

class doublyLinkedListController {
    public static void main(String[] args) {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addFirst("hammer");
        doublyLinkedList.addFirst("nail");
        doublyLinkedList.addFirst("drill");
        doublyLinkedList.addFirst("saw");
        doublyLinkedList.forward();
        doublyLinkedList.reverse();
        doublyLinkedList.addFirst("screws");
        doublyLinkedList.addFirst("2x4");
        doublyLinkedList.reverse();
    }
}