import java.util.Scanner;

public class array {
    public static void main(String args[]) {

        int n;
        int arr[], i; // initialise
        System.out.print("Enter size:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n]; // declare array

        for (i = 0; i < n; i++) {
            System.out.print("The value at " + i + " : \n");
            arr[i] = sc.nextInt();
        }

        for (i = 0; i < n; i++) {
            System.out.println(" " + arr[i]);
        }

    }
}