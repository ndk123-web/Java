public class Sum_digits {

    static int sum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n % 10 + sum(n / 10);
        }
    }

    public static void main(String args[]) {
        int n = 123;
        System.out.print(sum(n));
    }
}
