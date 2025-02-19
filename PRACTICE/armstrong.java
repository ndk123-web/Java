import java.util.*;
import java.lang.Math;

class armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, d, s = 0;
        System.out.print("Enter Armstrong no.");
        n = sc.nextInt();
        int t = n;
        int c = 0;
        while (n > 0) {
            n = n / 10;
            c++;
        }
        while (n > 0) {
            d = n % 10;
            s += (int) Math.pow(d, c);
            n = n / 10;
        }
        if (n == s)
            System.out.print("Armstrong");
        else
            System.out.print("Not Armstrong");
    }
}