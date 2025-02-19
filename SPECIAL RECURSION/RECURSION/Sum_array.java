import java.util.Arrays;

public class Sum_array {

    static int sum(int[] a, int len) {
        if (len < 0) {
            return 0;
        } else {
            return a[len] + sum(a, len - 1);
        }
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int len = a.length - 1;
        System.out.print(sum(a, len));
    }

}
