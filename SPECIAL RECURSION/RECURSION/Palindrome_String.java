public class Palindrome_String {

    static String reverse(String a, int end) {
        String b = a;
        if (end < 0) {
            return "";
        } else {
            return a.charAt(end) + reverse(a, end - 1);
        }
    }

    static void check(String a, String b) {
        if (a.equals(b) == true) {
            System.out.print("Palindrome");
        } else {
            System.out.print("Not Palindrome");
        }
    }

    public static void main(String args[]) {
        String a = "ndk";
        String b = a;
        int end = a.length() - 1;
        String c = reverse(a, end);
        check(a, c);
    }
}
