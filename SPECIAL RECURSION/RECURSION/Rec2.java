public class Rec2 {

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2); // a b c c=a+b
        }
    }

    public static void main(String[] args) {
        System.out.print("0 ");
        for (int i = 0; i < 4; i++)
            System.out.print(fibo(i) + " ");
    }
}
