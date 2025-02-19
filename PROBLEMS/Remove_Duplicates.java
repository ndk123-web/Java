public class Remove_Duplicates {

    static boolean[] map = new boolean[128]; // Assuming ASCII characters
    static StringBuilder newString = new StringBuilder();

    public static void RemoveDuplicate(String str, int end, int st) {
        if (st > end) {
            System.out.println(newString.toString());
            return;
        }

        char curr = str.charAt(st);

        if (!map[curr]) {
            newString.append(curr);
            map[curr] = true;
        }

        RemoveDuplicate(str, end, st + 1);
    }

    public static void main(String[] args) {
        String str = "aabbccdd";
        RemoveDuplicate(str, str.length() - 1, 0);
    }
}
