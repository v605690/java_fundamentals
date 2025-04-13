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
        return rebalanceInsert(cNode, item);
    }

    private Node rebalanceInsert(Node cNode, int item) {

        int leftHeight = height(cNode.leftChild);
        int rightHeight = height(cNode.rightChild);

        cNode.height = 1 + Math.max(leftHeight, rightHeight);

        int balnode = leftHeight - rightHeight;

        if (balnode > 1 && item < cNode.leftChild.item) {
            return rotateRight(cNode);
        }
        if (balnode < - 1 && item > cNode.rightChild.item) {
            return rotateLeft(cNode);
        }
        if (balnode > 1 && item > cNode.leftChild.item) {
            cNode.leftChild = rotateLeft(cNode.leftChild);
            return rotateRight(cNode);
        }

        if (balnode < -1 && item < cNode.rightChild.item) {
            cNode.rightChild = rotateRight(cNode.rightChild);

            return rotateLeft(cNode);
        }
        return cNode;
    }

    private Node rotateLeft(Node cNode) {
        Node child = cNode.rightChild;

        Node grandChild = child.leftChild;

        child.leftChild = cNode;
        cNode.rightChild = grandChild;

        int leftHeight = height(cNode.leftChild);
        int rightHeight = height(cNode.rightChild);

        cNode.height = 1 + Math.max(leftHeight, rightHeight);

        leftHeight = height(child.leftChild);
        rightHeight = height(child.rightChild);

        child.height = 1 + Math.max(leftHeight, rightHeight);

        cNode = child;
        return cNode;
    }

    private Node rotateRight(Node cNode) {
        Node  child = cNode.leftChild;
        Node oldRightChild = child.rightChild;

        child.rightChild = cNode;
        cNode.leftChild = oldRightChild;

        int leftHeight = height(cNode.leftChild);
        int rightHeight = height(cNode.rightChild);
        cNode.height = 1 + Math.max(leftHeight, rightHeight);

        leftHeight = height(child.leftChild);
        rightHeight = height(child.rightChild);
        child.height = 1 + Math.max(leftHeight, rightHeight);

        cNode = child;
        return cNode;
    }

    private int height(Node cNode) {
        if (cNode == null) {
            return 0;
        }
        return cNode.height;
    }
    public Node removeNode(Node rootNode, int item) {
        if (rootNode == null)
            return rootNode;

            if (item < rootNode.item) {
                rootNode.leftChild = removeNode(rootNode.leftChild, item);
            } else if (item > rootNode.item) {
                rootNode.rightChild = removeNode(rootNode.rightChild, item);
            } else {
                if (rootNode.leftChild == null)
                    return rootNode.rightChild;
                else if (rootNode.rightChild == null)
                    return rootNode.leftChild;

                    rootNode.item = lowestChild(rootNode.rightChild);

                    rootNode.rightChild = removeNode(rootNode.rightChild, rootNode.item);
                }
            return rootNode;
        }

    private int lowestChild(Node rightChild) {
        int lwch = rootNode.item;
        while (rootNode.leftChild != null) {
            lwch = rootNode.leftChild.item;
            rootNode = rootNode.leftChild;
        }
        return  lwch;
    }
}
