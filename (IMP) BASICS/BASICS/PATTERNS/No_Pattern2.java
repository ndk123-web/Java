public class No_Pattern2 {
    public static void main(String args[]) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1, c = 1; j <= i && c <= i + 1; j++, c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1, c = 1; j <= i && c <= i + 1; j++, c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
