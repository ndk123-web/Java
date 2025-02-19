class Duplicate_Remo {
    public static void main(String[] args) {

        int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };
        int track = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            arr[track++] = arr[i];

            while (i < len - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        for (int i = 0; i < track; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}