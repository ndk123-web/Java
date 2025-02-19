public class Find_Major {

    public static void FindMajor(int arr[], int len, int st, int major) {

        if (st >= len) {
            System.out.print(major);
            return;
        }
        if (arr[st] * (len / 2) > len) {
            if (arr[st] > major) {
                major = arr[st];
            }
        }
        FindMajor(arr, len, st + 1, major);
    }

    public static void main(String args[]) {
        int arr[] = { 3, 1, 3, 3, 2 };
        int len = arr.length;
        FindMajor(arr, len, 0, -1);
    }
}