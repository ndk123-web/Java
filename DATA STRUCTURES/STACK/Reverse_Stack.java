import java.util.Stack;

public class Reverse_Stack {
    static Stack<Integer> s = new Stack<>();

    static void PushAtBootom(int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int t = s.pop();
        PushAtBootom(data);
        s.push(t);
    }

    static void reverse(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }
        int t = s.pop();
        reverse(s);
        PushAtBootom(t);
    }

    public static void main(String[] args) {
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        reverse(s);

        System.out.println("After");

        while (!s.isEmpty()) {
            System.out.println(s.peek() + " ");
            s.pop();
        }
    }
}
