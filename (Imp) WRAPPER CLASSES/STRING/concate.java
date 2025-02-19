import java.util.Scanner;

class concate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = "Good Day!! ";
        String p;
        System.out.print("Enter your name");
        p = sc.nextLine();
        s = s.concat(p);
        System.out.print(s);
    }
}