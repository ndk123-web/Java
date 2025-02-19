public class GCD {

    static int gcd(int a, int b) {
        int z = a % b;
        if (z == 0) {
            return b;
        } else {
            return gcd(b, z);
        }
    }

    public static void main(String args[]) {
        System.out.print(gcd(24, 30));
    }
}
