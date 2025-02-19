public class merge_sort {

    public static void merge(int s, int m, int e, int arr[]) {
        int left_size = m - s + 1;
        int right_size = e - m;

        int L[] = new int[left_size];
        int R[] = new int[right_size];

        for (int i = 0; i < left_size; i++) {
            L[i] = arr[s + i];
        }
        for (int j = 0; j < right_size; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = s;
        while (i < left_size && j < right_size) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < left_size) {
            arr[k++] = L[i++];
        }
        while (j < right_size) {
            arr[k++] = R[j++];
        }

    }

    public static void sort(int s, int e, int arr[]) {
        if (s >= e) {
            return;
        }
        int m = (s + e) / 2;

        sort(s, m, arr);
        sort(m + 1, e, arr);
        merge(s, m, e, arr);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        sort(0, arr.length - 1, arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}