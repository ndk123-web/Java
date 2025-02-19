interface Array {

    int arrays(int a[]);

}

public class Arr {
    public static void main(String[] args) {

        Array max_ref = (arr) -> {
            int max = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        };

        Array sum_ref = (arr) -> {
            int s = 0;
            for (int n : arr) {
                s = s + n;
            }
            return s;
        };

        int a[] = { 1, 2, 3, 4, 5 };

        System.out.println("Max Value : " + max_ref.arrays(a));
        System.out.println("Sum of array : " + sum_ref.arrays(a));

    }
}
