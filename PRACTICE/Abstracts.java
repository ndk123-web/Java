import java.util.*;

abstract class op {
    public abstract int show(int a, int b);
}

class add extends op {
    public int show(int a, int b) {
        return (a + b);
    }
}

class sub extends op {
    public int show(int a, int b) {
        return (a - b);
    }
}

public class Abstracts {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a and b");
        a = sc.nextInt();
        b = sc.nextInt();
        op p;
        add aa = new add();
        p = aa;
        System.out.println("Add: " + p.show(a, b));
        sub ss = new sub();
        p = ss;
        System.out.println("Sub : " + p.show(a, b));
    }
}
