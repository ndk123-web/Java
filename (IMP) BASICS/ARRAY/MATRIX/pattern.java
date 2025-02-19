import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        int i, j;
        int arr[][];
        Scanner sc = new Scanner(System.in);
        arr = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        int c = 0;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < 2; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

    }
}