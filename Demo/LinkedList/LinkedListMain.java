package LinkedList;

public class LinkedListMain {

    public static void main(String[] args) {
//        Node<String> n1 = new Node<>("Hello");
//        Node<String> n2 = new Node<>("World");
//        Node<String> n3 = new Node<>("Yay!");
//
//        n1.next = n2;
//        n1.next = n3;
        CustomLinkedList<String> myLinkedList = new CustomLinkedList();

        myLinkedList.addFront("Hello");
        myLinkedList.addEnd("World");
        myLinkedList.addEnd("Yay!!!");
        myLinkedList.print();

        myLinkedList.remove("Yay!!!");
        myLinkedList.print();

        boolean b1 = myLinkedList.contains("World");
        System.out.println(b1);

        System.out.println(myLinkedList.size());
    }
}
