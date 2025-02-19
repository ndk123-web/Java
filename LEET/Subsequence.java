// Find All Subsequences of an Given String

class Subsequences {

    public static void sub(String str, int index, String newString) {
        if (index == str.length()) {
            System.out.println(newString + " ");
            return;
        }
        // Each word have 2 choices
        // to be include
        sub(str, index + 1, newString + str.charAt(index));

        // to be not include
        sub(str, index + 1, newString);
    }

    public static void main(String args[]) {
        String str = "abc";
        sub(str, 0, "");
    }
}