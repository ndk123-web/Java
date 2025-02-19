class Solid_Rhomus {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}