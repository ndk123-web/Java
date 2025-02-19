import java.util.*;

public class Patt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows");
        int r = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}