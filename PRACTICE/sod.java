import java.util.*;

public class sod {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int s = 0, d, n;
        System.out.print("Enter Digit");
        n = sc.nextInt();

        while (n > 0) {
            d = n % 10;
            s = s + d;
            n = n / 10;
        }
        System.out.print(s);
    }

}
