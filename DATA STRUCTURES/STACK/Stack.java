import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Stack {

    static Node head = null;

    static void push(int ele) {
        Node newNode = new Node(ele);
        newNode.next = head;
        head = newNode;
    }

    static void pop() {
        if (head == null) {
            System.out.println("LL Empty\n");
        } else {
            head = head.next;
        }
    }

    static void display() {
        Node p = head;
        if (head == null) {
            System.out.print("LL Empty\n");
        } else {
            while (p != null) {
                System.out.println(p.data);
                p = p.next;
            }
        }
    }

    static int peek() {
        if (head == null) {
            System.out.print("LL Empty\n");
            return -1;
        } else {
            return head.data;
        }
    }

    static void pushAtbottom(int ele) {
        Node p = head;
        if (p == null) {
            push(ele);
        } else {
            int t = peek();
            pop();
            pushAtbottom(ele);
            push(t);
        }
    }

    static Node reverse() {
        Node p = head;
        if (p == null) {
            return null;
        } else {
            int t = peek();
            pop();
            reverse();
            System.out.println(t);
        }
        return head;
    }

    static void removeright() {
        head = reverse();
        Node curr = head;
        Node max = head;

        while (curr != null) {
            if (curr.next.data < curr.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                max = curr;
            }
        }
        head = reverse();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch, ele;
        while (true) {
            System.out
                    .print("1.Push\n2.pop\n3.peek\n4.display\n5.PushAtBootom\n6.reverse\n7.RemoveRight\nEnter choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Element");
                    ele = sc.nextInt();
                    push(ele);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    peek();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.print("Enter element to push at bottom");
                    ele = sc.nextInt();
                    Node newNode = new Node(ele);
                    pushAtbottom(ele);
                    break;

                case 6:
                    reverse();
                    break;

                case 7:
                    removeright();
                    break;
            }
        }
    }
}