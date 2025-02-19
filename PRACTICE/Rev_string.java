import java.util.*;

public class Rev_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter String");
        s = sc.nextLine();
        int len = s.length();

        for (int i = len - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }
}