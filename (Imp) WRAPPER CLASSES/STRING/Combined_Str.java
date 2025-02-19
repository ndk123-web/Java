import java.util.Scanner;

class Combined_Str {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size");
        int n = sc.nextInt();
        int TotalLen = 0;
        String name[] = new String[n];
        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            TotalLen += name[i].length();
        }
        System.out.println("Total Length : " + TotalLen);
    }
}