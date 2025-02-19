import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    int index = -1;

    public Node buildtree(int node[]) {

        index++;

        if (node[index] == -1) {
            return null;
        }

        Node newNode = new Node(node[index]);
        newNode.left = buildtree(node);
        newNode.right = buildtree(node);

        return newNode;
    }

    public static void pretraverse(Node root) {
        Node p = root;
        if (p == null) {
            return;
        }
        System.out.print(p.data + " ");
        pretraverse(p.left);
        pretraverse(p.right);
    }

    public static void intraverse(Node root) {
        Node p = root;
        if (p == null) {
            return;
        }
        intraverse(p.left);
        System.out.print(p.data + " ");
        intraverse(p.right);
    }

    public static void posttraverse(Node root) {
        Node p = root;
        if (p == null) {
            return;
        }
        intraverse(p.left);
        intraverse(p.right);
        System.out.print(p.data + " ");

    }

}

public class All_Order_traversal {
    public static void main(String[] args) {

        int node[] = { 1, 2, 3, -1, -1, 5, -1, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildtree(node);

        System.out.print("Pre Order-> ");
        tree.pretraverse(root);
        System.out.println();

        System.out.print("In Order-> ");
        tree.intraverse(root);
        System.out.println();

        System.out.print("Post Order-> ");
        tree.posttraverse(root);

    }
}
