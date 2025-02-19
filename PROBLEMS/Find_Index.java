//Find 1st and last index of any charcter in string

class Find_Index {
    static int first = -1;
    static int last = -1;

    public static void findIndex(String str, int n, int st, char x) {

        if (st == n) {
            System.out.println("First Index " + first);
            System.out.println("Second Index " + last);
            return;
        }

        if (x == str.charAt(st)) {
            if (first == -1) {
                first = st;
            }
            last = st;
        }
        findIndex(str, n, st + 1, x);
    }

    public static void main(String args[]) {
        String str = "navnath";
        char x = 'a';
        findIndex(str, str.length() - 1, 0, x);
    }
}
