public class Count_Nodes {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static int index = -1;

    static Node built(int nodes[]) {
        index++;
        if (nodes[index] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = built(nodes);
        newNode.right = built(nodes);

        return newNode;
    }

    static int c = 0;

    static int count(Node root) {
        Node p = root;
        if (p == null) {
            return 0;
        }
        int left = count(p.left);
        int right = count(p.right);

        return 1 + left + right;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 3, -1, -1, 5, -1, -1, 6, -1, -1 };
        Node root = built(nodes);

        System.out.println(root.data);
        System.out.println("Total Nodes : " + count(root));
    }
}
