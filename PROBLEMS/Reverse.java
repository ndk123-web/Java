public class Reverse {

    public static void rev(String s, int n) {
        if (n < 0) {
            return;
        } else {
            System.out.print(s.charAt(n) + "");
            rev(s, n - 1);
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        rev(str, str.length() - 1);
    }
}
