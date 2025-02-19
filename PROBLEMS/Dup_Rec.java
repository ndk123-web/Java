import java.util.*;

public class Dup_Rec {

    public static void duplicateremove(int arr[], int st, int end) {
        if (st > end) {
            return;
        } else {
            if (st < end) {
                if (arr[st] == arr[st + 1]) {
                    duplicateremove(arr, st + 1, end);
                } else {
                    System.out.print(arr[st] + " ");
                    duplicateremove(arr, st + 1, end);
                }
            } else {
                System.out.print(arr[end] + " ");
                return;
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 5, 3, 3, 6, 6, 4, 4, 2, 2 };
        int len = arr.length;
        Arrays.sort(arr);                               // java.util.Arrays.sort(arr);
        duplicateremove(arr, 0, len - 1);
    }
}
