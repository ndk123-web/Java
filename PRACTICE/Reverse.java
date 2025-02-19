import java.util.*;

class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, d, s = 0;
        System.out.print("Enter number");
        n = sc.nextInt();
        while (n > 0) {
            d = n % 10;
            s = s * 10 + d;
            n = n / 10;
        }
        System.out.print(s);
    }
}