public class Normal_Fibo {
    public static void main(String[] args) {
        int n = 9;
        int a = 0, b = 1, next;
        System.out.print("0 1 ");
        for (int i = 0; i < n - 2; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.print(next + " ");
        }
    }
}
