public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 7, 2 };
        int small = 0;
        for (int i = 0; i < arr.length; i++) {
            small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            int t = arr[small];
            arr[small] = arr[i];
            arr[i] = t;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
