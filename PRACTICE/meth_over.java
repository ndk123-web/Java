import java.util.*;

class op {
    op() {
        System.out.println("Ha bhai kya krra!");
    }

    int area(int n) {
        int a;
        a = n * n;
        return a;
    }

    int area(int n, int p) {
        n = n * p;
        return n;
    }
}

public class meth_over {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        op k = new op();
        System.out.print("Enter a,b,c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println(" " + k.area(a));
        System.out.print(" " + k.area(b, c));
    }
}