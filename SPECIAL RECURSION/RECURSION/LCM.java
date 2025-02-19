public class LCM {

    static int lcm(int a, int b, int m) {
        if ((m % a) == 0 || (m % b) == 0) {
            return m;
        } else {
            return lcm(a, b, m + 1);
        }
    }

    public static void main(String args[]) {
        int a = 10, b = 50, m;
        if (a > b)
            m = a;
        else
            m = b;
        System.out.print(lcm(a, b, m));
    }
}
