import java.util.*;

public class Fibo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        int next, i;
        System.out.print("Enter number");
        int n = sc.nextInt();
        System.out.print(a);
        System.out.print(b);
        for (i = 0; i < n - 1; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.print(next);
        }

    }
}
