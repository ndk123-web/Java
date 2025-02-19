import java.util.Scanner;

public class armstrong {

    public static void main(String args[]) {

        int i, j, k;
        int n;

        System.out.println("Enter no. of rows");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 0; i < n; i++) {

            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
