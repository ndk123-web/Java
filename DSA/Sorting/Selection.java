public class Selection {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1, 6, 2 };

        int min = 0;
        int j = 0;

        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
