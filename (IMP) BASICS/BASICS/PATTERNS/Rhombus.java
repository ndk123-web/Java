class Rhombus {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++)
            System.out.print("* ");
        System.out.println();

        for (int i = 2; i < n; i++) {
            int space = i - 1;
            for (int j = 1; j <= space; j++)
                System.out.print(" ");
            System.out.print("* ");

            for (int j = 1; j <= n - 2; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }

        int s = n - 1;
        for (int j = 1; j <= s; j++) {
            System.out.print(" ");
        }
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }
}