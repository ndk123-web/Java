//sum of n natual no.

public class Rec1 {

    public static void sum(int n, int s) {
        if (n == 0) {
            System.out.println(s + " ");
            return;

        } else {
            s = s + n;
            sum(n - 1, s);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int n = 5;
        sum(5, 0);
    }
}
