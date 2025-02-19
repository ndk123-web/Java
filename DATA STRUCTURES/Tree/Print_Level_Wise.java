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

    public static void print_level_wise(Node root) {

        Node p = root;

        Queue<Node> q = new LinkedList<>();

        q.add(p);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null)
                    q.add(currNode.left);

                if (currNode.right != null)
                    q.add(currNode.right);
            }
        }
    }
}

public class Print_Level_Wise {
    public static void main(String[] args) {

        int node[] = { 1, 2, 3, -1, -1, 5, -1, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildtree(node);

        tree.print_level_wise(root);

    }
}