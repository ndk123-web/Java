import java.util.*;
import java.util.Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class RightLL_remove {
    static Node head = null;

    static void push(int ele) {
        Node newNode = new Node(ele);
        Node p = head;
        if (p == null) {
            head = newNode;
        } else {
            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }
    }

    static void pop() {
        if (head == null) {
            System.out.print("LL Empty\n");
        } else {
            head = head.next;
        }
    }

    static int peek() {
        if (head == null) {
            System.out.print("LL Empty");
            return -1;
        } else {
            return head.data;
        }
    }

    static Node reverse() {
        Node c = head;
        Node p = null, n = null;
        while (c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        head = p;
        return head;
    }

    static void display() {
        Node p = head;
        while (p != null) {
            System.out.print(p.data + "\t");
            p = p.next;
        }
    }

    static void removeright() {
        reverse();
        Node curr = head;
        Node max = head;

        while (curr != null && curr.next != null) {
            if (curr.next.data < max.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                max = curr;
            }
        }
        reverse();
    }

    public static void main(String args[]) {
        RightLL_remove r = new RightLL_remove();
        r.push(5);
        r.push(3);
        r.push(13);
        r.push(2);
        r.push(8);

        r.display();
        System.out.println();

        r.removeright();
        r.display();
    }
}
