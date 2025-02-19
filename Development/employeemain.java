import java.util.Scanner;

class employee {
    Scanner sc = new Scanner(System.in);
    private String name, username;
    private int id;

    void input() {
        System.out.print("Enter name");
        name = sc.nextLine();
        System.out.print("Enter Id");
        id = sc.nextInt();
        System.out.print("Enter username");
        sc.nextLine();
        do {
            username = sc.nextLine();
        } while (check(username) != 1);
    }

    int check(String us) {
        if ((us.length() >= 8 && us.length() <= 32) || (us.charAt(0) >= 'A' && us.charAt(0) <= 'Z')
                || (us.charAt(0) >= 'a' && us.charAt(0) <= 'z')) {
            System.out.print("Enter again username");
            return 1;
        } else
            return 0;
    }

    void display() {
        System.out.print("Name:" + name + "\nUsername:" + username + "\nId:" + id + "\n");
    }

}

class employeemain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        employee e[] = new employee[3];
        int i;

        for (i = 0; i < 3; i++) {
            e[i] = new employee();
            e[i].input();
        }
        for (i = 0; i < 3; i++) {
            e[i].display();
        }
    }
}