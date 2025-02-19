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

}

public class Pre_Order_Tree {
    public static void main(String[] args) {

        int node[] = {   };
        BinaryTree tree = new BinaryTree();
 
        Node root = tree.buildtree(node);

        System.out.println(root.data);

    }
}