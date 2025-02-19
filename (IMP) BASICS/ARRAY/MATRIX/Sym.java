import java.util.Scanner;

public class Sym {

    public static void main(String args[]) {
        int i, j, r, c, flag = 1;
        System.out.println("Enter Row and Column");
        Scanner sc = new Scanner(System.in);
        int a[][];
        r = sc.nextInt();
        c = sc.nextInt();
        a = new int[r][c];

        System.out.println("Elements :");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {

                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (a[i][j] != a[j][i]) {
                    flag = 0;
                    break;
                }
            }

        }
        if (flag == 1)
            System.out.println("Symmetric ");
        else
            System.out.println("Unsyemmetric");
    }
}