/* 
 1 2 3 4
 2 3 4 1
 3 4 1 2 
 4 1 2 3
*/

public class Pattern_3 {
    public static void main(String[] args) {

        int arr[] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {

                System.out.print(arr[(i + j) % len] + " ");

            }
            System.out.println();
        }

    }
}