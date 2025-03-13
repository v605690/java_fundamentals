package LinkedList;

public class CustomLinkedList<T> {

    private Node head;

    // custom constructor which is a empty custom linklist; empty object
    public CustomLinkedList(T...data) {
        if(data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                addFront(data[i]);

//                for (T item : data) {
//                    add(item);
//                }
            }
        }
    }

    public void addFront(T data) {
        // check if head is empty
        if (head == null) {
            // add the new element which is the head
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            // point newNode to current head
            newNode.next = head;
            // point head to newNode
            head = newNode;
        }
    }

    public void addEnd(T data) {
        if (head == null) {
            head = new Node(data);
        } else {
            // Must create iterator since you have to go through each element in a LinkedList
            Node iterator = head;

            while (iterator.next != null) {
                iterator = iterator.next;
            }
            // iterator exits while loop since it reached null, then adds node to end
            iterator.next = new Node(data);
        }
    }

    public T popFront() {
        if (head == null) {
            return null;
        }
        // grab head and save to returnValue
        Node returnValue = head;
        // change head and point it to the next one
        head = head.next;
        // return the value
        return (T) returnValue.data;
    }

    public void remove(T data) {
        // list is empty nothing to delte
        if (head == null) {
            return;
        }
        // the item they want to delete is the first element in the linked list
        if (head.data == data) {
            popFront();
        } else {
            // not the first element, start iterating - don't modify "head" ever
            Node iterator = head;

            // because we may need to delete from the middle or end of the list
            // we want to track the previous node
            Node previous = null;

            // start iterating until we find data or reach the end of the list
            while (iterator.data != data && iterator.next != null) {
                previous = iterator;
                iterator = iterator.next;
            }
            // when we exit while loop we have found data or the end of the list

            // if it's the end of the list and the data does not match - 404 not found
            if (iterator.next == null && iterator.data != data) {
                System.out.println("The data you're trying to delete does not exist");
                return;

            // if we found the end of the list and the data match, delete last element
            } else if (iterator.next == null && iterator.data == data) {
                previous.next = null;

            // otherwise, we found data in the middle of the list and need to prune it, delete it
            } else {
               previous.next = iterator.next;
            }
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node iterator = head;

        System.out.println(iterator.data);

        while (iterator.next != null) {
            iterator = iterator.next;
            System.out.println(iterator.data);
        }
    }

    public int size() {
        int count = 0;

        if (head == null) {
            return count;
        }

        Node iterator = head;
        count++;

        while (iterator.next != null) {
            iterator = iterator.next;
            count++;
        }

        return count;
    }

    public boolean contains(T data) {
        if (head == null) {
            return false;
        }

        Node iterator = head;

        if (iterator.data == data) {
            return true;
        }

        while (iterator.next != null) {
            iterator = iterator.next;

            if (iterator.data == data) {
                return true;
            }
        }
        return false;
    }
}
