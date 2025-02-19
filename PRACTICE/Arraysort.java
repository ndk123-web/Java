import java.util.*;

public class Arraysort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int t;
        System.out.print("Enter Random Array");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Sorted in ascending");
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i]);
        }
    }
}