import java.util.Scanner;

public class arr {

    public static void main(String args[]) {

        int n, i;
        int ar[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array");
        n = sc.nextInt();
        System.out.println("The Elements are : ");
        ar = new int[n];

        for (i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("The array is : \n");

        for (i = 0; i < n; i++) {
            System.out.println(" " + ar[i]);
        }

    }
}
