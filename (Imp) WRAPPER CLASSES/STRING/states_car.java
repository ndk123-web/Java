import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String states[] = {"MH", "TN", "PB", "MB", "DH"};
        String s[] = {"Maharastra", "Telangana", "Punjab", "Mumbai", "Delhi"};

        System.out.print("Enter Car number: ");
        String a = sc.nextLine();
        char b1 = a.charAt(0);
        char b2 = a.charAt(1);

        for (int i = 0; i < 5; i++) {
            if (b1 == states[i].charAt(0) && b2 == states[i].charAt(1)) {
                System.out.println("State is " + s[i]);
                break; // Once found, no need to continue the loop
            }
        }
    }
}
