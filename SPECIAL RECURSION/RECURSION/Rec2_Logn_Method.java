//x raise to n in logn stack memory 

public class Rec2_Logn_Method {

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;

        if (n % 2 == 0) { // Even power
            return power(x, n / 2) * power(x, n / 2);
        } else { // Odd Power
            return power(x, n / 2) * power(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 5, n = 2;
        System.out.print(power(x, n));
    }
}
