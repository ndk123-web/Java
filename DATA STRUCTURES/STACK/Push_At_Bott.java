import java.util.Stack;

public class Push_At_Bott {

    static void PushAtBootom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(40);
            return;
        }
        int t = s.pop();
        PushAtBootom(s, data);
        s.push(t);
    }

    public static void main(String[] args) {

        Push_At_Bott p = new Push_At_Bott();

        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        p.PushAtBootom(s, 40);

        while (!s.isEmpty()) {
            System.out.println(s.peek() + " ");
            s.pop();
        }

    }
}
