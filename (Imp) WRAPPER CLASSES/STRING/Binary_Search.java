import java.util.Scanner;

class Bina {
    String[] names = new String[5]; // Initialize names array
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.print("Enter Name: ");
        for (int i = 0; i < 5; i++) {
            names[i] = sc.nextLine();
        }
    }

    int ret(String t) {
        for (int i = 0; i < 5; i++) {
            if (names[i].equals(t)) // Compare strings using equals method
                return 1;
        }
        return 0; // Return 0 if not found after loop completes
    }
}

public class Binary_Search {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Bina b = new Bina(); // Create a single instance of Bina class

        // Input names
        b.input();

        System.out.print("Enter name you want to find: ");
        String t = sc.nextLine();
        if (b.ret(t) == 1)
            System.out.print("Found");
        else
            System.out.print("Not found");

        sc.close(); // Close scanner
    }
}
