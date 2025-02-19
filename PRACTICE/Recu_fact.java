import java.util.*;

class op {
    int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}

public class Recu_fact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter n");
        n = sc.nextInt();
        op p = new op();
        System.out.print("Fact : " + p.fact(n));
    }
}