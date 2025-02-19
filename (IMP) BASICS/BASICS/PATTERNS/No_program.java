//1        1
//12      21
//123    321
//1234  4321
//1234554321

public class No_program {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            int s = n - i;
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = 1, k = i; j <= i && k >= 1; j++, k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
