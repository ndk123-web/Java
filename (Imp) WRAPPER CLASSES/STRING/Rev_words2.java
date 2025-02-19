import java.util.*;

public class Rev_words2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder reverse = new StringBuilder("Hello");

        for (int i = 0; i < reverse.length() / 2; i++) {
            int f = i;
            int b = reverse.length() - 1 - i;

            char frontward = reverse.charAt(f);
            char backward = reverse.charAt(b);

            reverse.setCharAt(f, backward);
            reverse.setCharAt(b, frontward);

        }
        System.out.print("Reveese : " + reverse);
    }
}
