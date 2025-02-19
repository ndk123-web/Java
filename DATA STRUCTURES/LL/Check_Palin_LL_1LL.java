public class Check_Palin_LL_1LL {

    static Node head = null;
    static Node secondhead = null;
    static int size = 0;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void insert(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node p = head;
        while (p.next != null)
            p = p.next;

        p.next = newNode;
    }

    static boolean checkpalin() {
        Node p = head;
        Node q = secondhead;
        while (p != null && q != null) {
            if (p.data != q.data) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return true;
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Check_Palin_LL_1LL list = new Check_Palin_LL_1LL();

        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(1);

        int mid = size / 2;
        int i = 0;

        Node p = head;

        while (i < mid - 1) {
            p = p.next;
            i++;
        }

        // Handle the case when the size is odd
        if (size % 2 != 0) {
            p = p.next;
        }

        secondhead = p.next;
        p.next = null;

        secondhead = reverse(secondhead);

        if (checkpalin()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
