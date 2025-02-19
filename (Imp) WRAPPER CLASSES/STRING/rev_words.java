import java.util.Scanner;

class reverse {
    void rev(String s) {
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
    }
}

class rev_words {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter String");
        s = sc.nextLine();
        reverse r = new reverse();
        String words[] = s.split("\\s+");
        for (int i = 0; i <= words.length - 1; i++) {
            System.out.print(words[i]);
            if (i != 0)
                System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i <= words.length - 1; i++) {
            r.rev(words[i]);
        }
    }
}