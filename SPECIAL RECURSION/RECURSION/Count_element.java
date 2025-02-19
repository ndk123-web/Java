
public class Count_element {
    static int count(String a, int c, char b, int len) {
        if (b == a.charAt(len)) {
            c++;
        }
        if (len <= a.length() - 1) {
            return c;
        }
        return count(a, c, b, len + 1);
    }

    public static void main(String args[]) {
        String a = "navnath";
        char b = 'v';
        int c = 1;
        int len = 0;
        System.out.print(count(a, c, b, len));
    }
}
