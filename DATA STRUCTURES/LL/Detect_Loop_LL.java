//Floyds Method  
//1 turtle 1 rabbit hai pointer 
//turtle takes 1 step and rabbit takes 2 steps
//jab turtle and rabbit same location pe aayenge to Loop hai ny to ny hai

public class Detect_Loop_LL {

    static Node head = null;

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
        Node p = head;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    static boolean detect() {
        Node turtle = head, rabbit = head;
        while (rabbit.next.next != null && rabbit != null) {
            if (turtle == rabbit) {
                return true;
            }
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }
        return false;
    }

    static void removeloop() {
        Node slow = head, fast = head;

        // Detect loop using Floyd’s Cycle-Finding Algorithm
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Loop detected
            if (slow == fast) {
                break;
            }
        }

        // If loop is detected
        if (slow == fast) {
            slow = head;

            // Special case when the loop is at the beginning
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
            } else {
                // Find the start of the loop
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            }

            // Remove the loop
            fast.next = null;
        }
    }

    public static void main(String[] args) {

        Detect_Loop_LL list = new Detect_Loop_LL();

        list.insert(1);
        list.insert(2);
        list.insert(3);

        Node p = head;

        while (p.next != null) {
            p = p.next; // 1 2 3 1 2 3 1 2 3
        }
        p.next = head;

        if (detect()) {
            System.out.println("There is Loop in LL");
        } else {
            System.out.println("There is no loop");
        }

        removeloop();

    }
}
