import java.util.Scanner;

class pal {

    int ispali(int n, int t) {
        if (ispalicheck(n, 0) == t)
            return 1;
        else
            return 0;
    }

    int ispalicheck(int n, int reversed) {
        if (n == 0)
            return reversed;
        else
            return ispalicheck(n / 10, reversed * 10 + n % 10);
    }

}

class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, t;
        System.out.print("Enter number");
        n = sc.nextInt();
        t = n;
        pal p = new pal();
        if (p.ispali(n, t) == 1)
            System.out.print("Its palindrome");
        else
            System.out.print("Its not palindrome");
    }
}