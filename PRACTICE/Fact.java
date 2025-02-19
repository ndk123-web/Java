import java.util.*;

class Fact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, s = 1, i;
        System.out.print("Enter n");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            s = s * i;
        }
        System.out.print(s);
    }
}