import java.util.*;

public class Exception {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter a and b");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            c = a / b;
            System.out.print(c);
        } catch (ArithmeticException e) {
            System.out.print("b should not be 0");
        }
    }
}
