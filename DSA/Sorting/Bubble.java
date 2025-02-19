/*
bubble sort

i j
8 3 1 5 4

1 8 3 5 4  (I)
1 3 8 5 4  (II)
1 3 4 8 5  (III)  	
1 3 4 5 8  (IV)
*/

public class Bubble {
    public static void main(String[] args) {
        int arr[] = { 8, 3, 1, 5, 4 };  // 1 8 3 5 4 -> 1 3 8 5 4 -> 
        int i, j;

        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}