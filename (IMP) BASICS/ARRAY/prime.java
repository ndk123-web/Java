import java.util.Scanner;

public class prime {

    public static void main(String args[]) {

        int n, i, flag;

        for (n = 2; n <= 100; n++) {
            flag = 1;
            for (i = 2; i <= n / 2; n++) {
                if (n % i == 0) {
                    flag = 0;

                }
                if (flag == 1)
                    System.out.println(" " + n);
            }
        }
    }
}