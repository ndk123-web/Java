public class Check_Palin_LL {

    static Node head = null;
    static Node rev = null;
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
        int a[] = new int[size];
        int c = 0;
        Node p = head;
        while (p != null) {
            a[c++] = p.data;
            p = p.next;
        }
        int i = 0, j = a.length - 1;
        while (i < j) {
            if (a[i] != a[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Check_Palin_LL list = new Check_Palin_LL();

        list.insert(1);
        list.insert(2);
        list.insert(1);

        if (checkpalin()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not an Palindrome");
        }
    }
}
