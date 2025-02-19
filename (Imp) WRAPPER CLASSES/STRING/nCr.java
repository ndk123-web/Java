import java.util.Scanner;

class NCR {
    int ncr(int n, int r) {
        if (n == r || r == 0)
            return 1;
        else
            return ncr(n - 1, r - 1) + ncr(n - 1, r);
    }

    int fact(int n) {
        int i, s = 1;
        for (i = n; i >= 1; i--) {
            s = s * i;
        }
        return s;
    }
}

public class nCr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, r;
        System.out.print("Enter n and r");
        n = sc.nextInt();
        r = sc.nextInt();
        NCR k = new NCR();
        System.out.print(" nCr :  " + k.ncr(n, r));
    }
}