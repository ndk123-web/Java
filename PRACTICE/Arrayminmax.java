import java.util.*;

public class Arrayminmax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, min, max;
        int a[] = new int[5];

        System.out.print("Enter 5 number");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        max = a[1];
        min = a[1];
        for (i = 0; i < 5; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min :" + min);
    }
}