public class Remove_Loop {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    static void printll() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    static void detect() {
        Node slow = head, fast = head;
        Node prev = null;
        boolean hascycle = false;

        while (fast != null && fast.next != null) {
            prev = fast;
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                hascycle = true;
                break;
            }
        }

        if (hascycle) {
            slow = head;
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            } else {
                while (fast.next != slow.next) {
                    slow = slow.next;
                    prev = fast;
                    fast = fast.next;
                }
            }
            fast.next = null;

        } else
            System.out.println("There is No loop");
        return;
    }

    public static void main(String args[]) {
        Remove_Loop ll = new Remove_Loop();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);

        head.next.next.next.next = head.next;

        detect();

        printll();
    }
}
