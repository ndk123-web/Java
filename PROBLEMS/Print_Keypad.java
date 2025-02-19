//Print Keypad combinations

public class Print_Keypad {

    static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void combinations(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char current = str.charAt(idx);
        String mapping = keypad[current - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            combinations(str, idx + 1, newString + mapping.charAt(i));
        }

    }

    public static void main(String[] args) {
        String str = "23";
        combinations(str, 0, "");
    }
}