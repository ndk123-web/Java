import java.util.*;

public class Rev_Word1 {

    public static String Reverse(String n) {
        String res = " ";
        int len = n.length();
        for (int i = len - 1; i >= 0; i--) {
            res = res + n.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word\n");
        String n = sc.next();
        result = Reverse(n);
        System.out.print("Reverse Word : " + result);
    }
}
