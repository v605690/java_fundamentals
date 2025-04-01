package labs_examples.datastructures.trees.labs;

/*
    Trees: Exercise_01

    Please demonstrate how to create a custom Binary Search Tree (BST). Using your custom BST, demonstrate how to:

        1.) Create a new CustomBST
        2.) Insert new elements
        3.) Retrieve elements
        4.) Update elements
        5.) Delete elements
        6.) Print elements (Bonus: try in-order traversal, pre-order traversal, post-order traversal)
        7.) Keep the tree well balanced

 */

class Node {
    Node leftChild;
    Node rightChild;

    int item;
    int height;

    public Node(int item) {
        this.item = item;
        this.height = 1;
    }
}

public class PravinBST {

    Node rootNode;
    int size;

    PravinBST(int...item) {
        if (item.length <1) {
            rootNode = null;
        } else {
            for (int i = 0; i < item.length; i++) {
                add(item[i]);
            }
        }
    }

    private void add(int item) {
        if (rootNode == null) {
            rootNode = new Node(item);
            size++;
        } else {
            rootNode = insert(item, rootNode);
        }
    }

    private Node insert(int item, Node cNode) {
        if (cNode == null) {
            cNode = new Node(item);
            size++;
        }
        if (item < cNode.item) {
            cNode.leftChild = insert(item, cNode.leftChild);
        } else if (item > cNode.item) {
            cNode.rightChild = insert(item, cNode.rightChild);
        } else {
            return cNode;
        }
        return null; //rebalanceInsert(cNode, item);
    }

//    private Node rebalanceInsert(Node cNode, int item) {
//
//        int leftHeight = height(cNode.leftChild);
//        int rightHeight = height(cNode.rightChild);
//
//        cNode.height = 1 + Math.max(leftHeight, rightHeight);
//
//        int balnode = leftHeight - rightHeight;
//
//        if (balnode > 1 && item < cNode.leftChild.item) {
//            return rotateRight(cNode);
//        }
//    }
//
//    private Node rotateRight(Node cNode) {
//
//    }

    private int height(Node cNode) {
        if (cNode == null) {
            return 0;
        }
        return cNode.height;
    }
}