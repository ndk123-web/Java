import java.util.*;

class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        boolean check;
        System.out.print("Enter n");
        n = sc.nextInt();
        check = true;
        for (i = 2; i <= 10; i++) {
            if (n == 2) {
                System.out.print("Prime");
                break;
            }
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.print("Prime");

        } else {
            System.out.print("Not Prime");
        }

    }
}