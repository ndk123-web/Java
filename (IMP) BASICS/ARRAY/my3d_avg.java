import java.io.*;

public class my3d_avg {
    public static void main(String args[]) {

        int i, j, k, s = 0, avg, c = 0;
        int my3darr[][][] = new int[3][3][3];

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    my3darr[i][j][k] = (i + 1) * (j + 1) * (k + 1);
                    c++;
                }
            }

        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                for (k = 0; k < 3; k++) {
                    s = s + my3darr[i][j][k];
                }
            }
        }
        avg = s / c;
        System.out.println("The Sum : " + s);
        System.out.println("The Length : " + c);
        System.out.println("The Average : " + avg);

    }
}