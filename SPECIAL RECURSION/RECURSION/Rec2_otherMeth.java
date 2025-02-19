public class Rec2_otherMeth {

    public static void fibo(int a, int b, int next, int n) {
        if (n == 0) {
            return;
        } else {
            next = a + b;
            a = b;
            b = next;
            System.out.print(next + " ");
            fibo(a, b, next, n - 1);
        }
    }

    public static void main(String args[]) {
        int n = 5;
        int a = 0, b = 1;
        System.out.print("0 ");
        System.out.print("1 ");
        fibo(a, b, 0, n - 2);
    }
}
