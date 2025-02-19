import java.io.*;

public class my3d_arr {
    public static void main(String args[]) {

        int i, j, k;
        int my3darr[][][] = new int[3][3][3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    my3darr[i][j][k] = (i + 1) * (j + 1) * (k + 1);
                }
            }

        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    System.out.print(my3darr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}