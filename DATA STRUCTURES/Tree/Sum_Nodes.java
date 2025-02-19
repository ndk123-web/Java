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

    public static int sum(Node data) {
        Node p = data;

        if (p == null) {
            return 0;
        }

        int left = sum(p.left);
        int right = sum(p.right);

        return p.data + left + right;

    }

}

public class Sum_Nodes {
    public static void main(String[] args) {

        int node[] = { 1, 2, 3, -1, -1, 5, -1, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildtree(node);

        System.out.println(root.data);

        System.out.println("Sum : " + tree.sum(root));

    }
}