import java.io.*;
import java.util.Scanner;

class Stackk {
    int a[] = new int[10];
    int top;

    public Stackk() {
        top = -1;
    }

    public void push(int data) {
        top++;
        a[top] = data;
    }

    public int pop() {
        int x;
        x = a[top];
        top--;
        return x;
    }

    public int peek() {
        return a[top];
    }

    public void display() {
        int i;
        for (i = 0; i <= top; i++) {
            System.out.print(a[i] + "\n");
        }
    }
}

public class Stack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stackk s = new Stackk();
        int ch, ele;
        while (true) {
            System.out.print("1.push\n2.pop\n3.peek\n4.display\n5.exit\n");
            System.out.print("Enter your choice ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter data");
                    ele = sc.nextInt();
                    s.push(ele);
                    break;

                case 2:
                    System.out.print("popped: " + s.pop());
                    break;

                case 3:
                    System.out.print("Peek: " + s.peek());
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.print("THANKUU!!");
                    return 0;
                    break;

                default:
                    System.out.print("Invalid choice");
                    break;
            }
        }

    }
}