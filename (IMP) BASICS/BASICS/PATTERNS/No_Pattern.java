public class No_Pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
