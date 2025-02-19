
public class Power {

    static int pw(int n, int power) {
        if (power == 0) {
            return 1;
        } else {
            return n * pw(n, power - 1);
        }
    }

    public static void main(String args[]) {
        System.out.print(pw(4, 2));
    }
}
