import java.util.Scanner;

class Dene {
    String name[] = new String[5];
    int i;
    String username[] = new String[5];

    void entry(String name, String username) {
        for (i = 0; i < 5; i++) {
            this.name[i] = name;
            this.username[i] = name;
        }
    }

    void exit(String exitn) {
        if (bina(exitn) == 1)
            System.out.print("Succesfully Exit");
        else
            System.out.print("Name not found");
    }

    int bina(String exitl) {
        for (i = 0; i < 5; i++) {
            if (name[i].equals(exitl))
                return 1;
        }
        return 0;
    }

    void display() {
        for (i = 0; i < 5; i++) {
            System.out.print(" " + this.name[i]);
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name, username, exitname;
        int i = 0, ch;
        Dene d[] = new Dene[5];
        while (true) {
            System.out.print("1.Entry\n2.Exit\n3.Display\n");
            System.out.print("Enter choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter name\n");
                    name = sc.nextLine();
                    System.out.print("Enter Username\n");
                    username = sc.nextLine();
                    while (i < 5) {
                        d[i] = new Dene();
                        d[i].entry(name, username);
                    }
                    break;

                case 2:
                    System.out.print("Enter Name for Exit");
                    exitname = sc.nextLine();
                    exit(exitname);
                    break;

                case 3:
                    display();
                    break;

                default:
                    System.out.print("Invalid choice");
                    break;
            }

        }
    }
}