//Unique subsequnece ko print krna hai

import java.util.HashSet;

public class Unique_Subseq {

    public static void sub(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char current = str.charAt(idx);
        sub(str, idx + 1, newString + current, set);
        sub(str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        sub(str, 0, "", set);
    }
}
