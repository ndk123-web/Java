class Merge_Sort_Rec {

    public static void mergesort(int arr[], int st, int end) {
        if (st < end) {
            int mid = (st + end) / 2;

            mergesort(arr, st, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, st, end, mid);
        }
    }

    public static void merge(int arr[], int st, int end, int mid) {
        int i = st, j = mid + 1, k = 0;
        int temp[] = new int[end - st + 1];

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (i = st; i <= end; i++) {
            arr[i] = temp[i - st];
        }

    }

    public static void main(String args[]) {
        int arr[] = { -2, 45, 2, 123, 42, -3 };
        int len = arr.length - 1;

        mergesort(arr, 0, len);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}