public class Unique_Pattern {
    public static void main(String args[]) {
        int n = 7;
        int s;
        for (int i = 1; i <= n; i++) {
            System.out.print(" * ");
        }
        System.out.println();

        for (int i = 1; i < n - 1; i++) {
            int space = i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            System.out.print(" * ");
            for (int j = 1; j < n - 1; j++)
                System.out.print(" <>");
            System.out.print(" *");
            System.out.println();
        }
        int space = n;
        for (int i = 1; i <= space; i++) {
            System.out.print("  ");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print("*  ");
        }
    }
}
