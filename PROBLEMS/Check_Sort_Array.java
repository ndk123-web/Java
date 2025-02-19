//check array is strictly incresing or Not

public class Check_Sort_Array {

    public static boolean CheckArr(int arr[], int len, int st) {
        if (st == len - 1) {
            return true;
        }

        if (arr[st] >= arr[st + 1]) {
            return false;
        }

        return CheckArr(arr, len, st + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 7 };
        if (CheckArr(arr, arr.length, 0)) {
            System.out.println("Sorted Array");
        } else {
            System.out.println("Not Sorted");
        }
    }
}
