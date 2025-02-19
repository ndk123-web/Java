import java.util.*;

class gcd {
    int Gcd(int a, int b) {
        int z = a % b;
        if (z == 0)
            return b;
        else
            return Gcd(b, z);
    }
}

public class Recu_gcd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter a and b");
        a = sc.nextInt();
        b = sc.nextInt();
        gcd d = new gcd();
        System.out.print(" " + d.Gcd(a, b));
    }
}