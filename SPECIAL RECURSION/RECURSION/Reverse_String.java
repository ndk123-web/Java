import java.util.*;

public class Reverse_String {

    static String reverse(String a, int len) {
        if (len < 0) {
            return "";
        } else {
            return a.charAt(len) + reverse(a, len - 1);
        }
    }

    public static void main(String args[]) {
        String a = "navnath";
        int len = a.length() - 1;
        System.out.print(reverse(a, len));
    }
}
