import java.util.Scanner;

public class madd {
    public static void main(String args[]) {

        int i, j, r, c, s = 0;
        System.out.println("Enter row and colums");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        int a[][];
        a = new int[r][c];

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The addition of all elements is ");

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                s = s + a[i][j];
            }
        }
        System.out.println("The add : " + s);
        s = 0;
        System.out.println("The diagonal add is :");

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                if (i == j) {
                    s = s + a[i][j];
                }
            }
        }
        System.out.println(" " + s);

    }
}