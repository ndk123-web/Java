public class Rotation {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < 5 - 1; i++) {
            int t = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = t;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
