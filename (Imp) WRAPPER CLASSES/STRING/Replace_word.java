public class Replace_word {
    public static void main(String[] args) {
        String n = "navnath";
        String res = "";
        // System.out.print(n.replace('n', 'e'));

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'n') {
                res = res + 'e';
            } else {
                res = res + n.charAt(i);
            }
        }
        System.out.println(res);
    }
}
