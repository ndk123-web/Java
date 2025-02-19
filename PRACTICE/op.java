import java.util.*;

public class op {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter String");
        s = sc.nextLine();
        int f[] = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = (int) ch;
            f[index]++;
        }

        for (int i = 0; i < f.length; i++) {
            if (f[i] != 0) {
                System.out.println((char) i + ":" + f[i]);
            }
        }
    }
}