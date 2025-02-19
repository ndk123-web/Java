//print 5 to 1 using recursive

public class Rec {

    public static void rec(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print(n + " ");
            rec(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        rec(n);
    }
}
