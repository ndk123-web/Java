import java.util.Scanner;

public class LL_userDefined {

    static Node head = null;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void insertfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    static void insertlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }
    }

    static void DeleteFirst() {
        if (head == null) {
            System.out.println("LL Empty");
        } else {
            head = head.next;
        }
    }

    static void DeleteLast() {
        Node pre = null, curr = head;
        if (head == null) {
            System.out.println("LL empty");
        }
        if (head.next == null) {
            head = null;
        }
        while (curr.next != null) {
            pre = curr;
            curr = curr.next;
        }
        pre.next = null;
    }

    static void print() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();
    }

    static Node reverse(Node head) {
        Node p = null, q = null, r = head;
        while (r != null) {
            p = q;
            q = r;
            r = r.next;
            q.next = p;
        }
        return q;
    }


        Scanner sc = new Scanner(System.in);
        int ch, data;

        while (true) {
            System.out.print("1.InsertFirst\n2.InsertLast\n3.DeleteFirst\n4.DeleteLast\n5.Print\n6.Reverse\n7.Exit\n");
            System.out.print("Enter Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    insertfirst(data);
                    break;

                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    insertlast(data);
                    break;

                case 3:
                    DeleteFirst();
                    break;

                case 4:
                    DeleteLast();
                    break;

                case 5:
                    print();
                    break;

                case 6:
                    head = reverse(head);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
