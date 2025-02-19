public class No_Patern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1, k = i; j <= i && k >= 1; j++, k--) {
                System.out.print(k);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
