import java.util.*;

public class Arrayadd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i, s = 0;
        for (i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            s = s + a[i];
        }
        System.out.print("Sum : " + s);
    }
}