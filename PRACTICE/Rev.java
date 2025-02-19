import java.util.*;

class rev {
    int reverse(int n, int revno) {
        revno = revno * 10 + n % 10;
        if (n == 0)
            return revno / 10;
        else
            return reverse(n / 10, revno);
    }
}

public class Rev {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Number");
        n = sc.nextInt();
        rev r = new rev();
        System.out.print(r.reverse(n, 0));
    }
}