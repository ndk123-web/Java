import java.util.Scanner;

public class sumarr {
    public static void main(String args[]) {

        int i, n;
        int e = 0, o = 0, j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < i; j++) {
                if (i % 2 == 0)
                    ++e;
                else
                    ++o;
            }
        }
        System.out.println("The Even sum :" + e);
        System.out.println("The odd sum: " + o);

    }
}