class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 6, 3, 2 };
        int i, j;

        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}