import java.util.LinkedList;
import java.util.Queue;

class result {

    public void eval(Queue<Integer> Allnums, Queue<Character> Alloprs, char opr) {
        int size = Alloprs.size(); // Get the size of the queue
        int position = -1;
        for (int i = 0; i < size; i++) {
            char c = Alloprs.poll(); // Retrieve and remove the front element
            if (c == opr) {
                position = i; // Save the position of the operator
                updated(Allnums, Alloprs, position, opr);
            } else {
                Alloprs.add(c); // Add the element back to preserve the original order
            }
        }
        if (position == -1) {
            System.out.println("Position of " + opr + " is not found !");
        }
    }

    public void updated(Queue<Integer> Allnums, Queue<Character> Alloprs, int pos, char opr) {
        int a = 0, b = 0, c = 0;
        int size = Allnums.size();
        Queue <Integer> tempnums = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            if (i == pos) {
                a = Allnums.poll();
                b = Allnums.poll();
                c = ans(a, b, opr);
                tempnums.add(c);
                i++;
            }else{
                tempnums.add(Allnums.poll());
            }
        }
        Allnums.clear();
        Allnums.addAll(tempnums);
    }

    public int ans(int a, int b, char opr) {
        int an = 0;
        switch (opr) {
            case '+': an= a + b; break;
            case '-': an= a - b; break;
            case '*': an= a * b; break;
            case '/': an= a / b; break;
        }
        return an;
    }
}

public class Eval {
    public static void main(String[] args) {
        String s = "2+3*10-2/5";
        Queue<Integer> Allnums = new LinkedList<>();
        Queue<Character> Alloprs = new LinkedList<>();

        String inp = "";
        int conv = 0;
        char chk;

        // convert string to queue of integers and queue of operators
        // ---------------------------------------------------------

        for (int i = 0; i < s.length(); i++) {
            chk = s.charAt(i);
            if (chk == '*' || chk == '/' || chk == '+' || chk == '-') {
                conv = Integer.parseInt(inp);
                Alloprs.add(chk);
                Allnums.add(conv);
                conv = 0;
                inp = "";
            } else {
                inp += chk;
            }
        }
        conv = Integer.parseInt(inp);
        Allnums.add(conv);

        // convert string to queue of integers and queue of operators
        // ---------------------------------------------------------

        result rs = new result();

        // Priority order of operators
        // ------------------------------------------------------
        rs.eval(Allnums, Alloprs, '*');
        rs.eval(Allnums, Alloprs, '/');
        rs.eval(Allnums, Alloprs, '-');
        rs.eval(Allnums, Alloprs, '+');
        // Priority order of operators
        // ------------------------------------------------------

        System.out.println(Allnums);
        System.out.println(Alloprs);
    }
}