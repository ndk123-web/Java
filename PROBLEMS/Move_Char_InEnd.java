//Move that all give char to the end of String

public class Move_Char_InEnd {
    int c = 0;

    public static void MoveChar(StringBuilder str, int end, int st, char x) {
        int c = 0;
        if (st >= end) {
            System.out.print(str.toString());
            return;
        }
        if (str.charAt(st) == x) {
            str.deleteCharAt(st);
            str.append(x);
            MoveChar(str, end - 1, st, x);
        } else {
            MoveChar(str, end, st + 1, x);
        }
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("ndkddkjhjj");
        char x = 'd';
        MoveChar(str, str.length() - 1, 0, x);
    }
}
