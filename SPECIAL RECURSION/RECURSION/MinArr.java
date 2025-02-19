public class MinArr {

    static int min(int a[], int len) {
        if (len < 0) {
            return Integer.MAX_VALUE;
        }
        int mini = min(a, len - 1);
        return Math.min(a[len], mini);
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int len = a.length - 1;
        System.out.print(min(a, len));

    }
}
