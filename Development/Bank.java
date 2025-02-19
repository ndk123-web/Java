import java.util.Scanner;

class saving {
    String name, add;
    int dep, ac;

    saving(String name, int ac, String add, int dep) {
        this.name = name;
        this.ac = ac;
        this.add = add;
        this.dep = dep;
    }

    void displays() {
        System.out.print("Name:" + name + "\nAccount no." + ac + "\nAddress:" + add + "\nDeposit:" + dep + "\n ");
    }
}

class current {
    String name, add;
    int dep, ac;

    current(String name, int ac, String add, int dep) {
        this.name = name;
        this.ac = ac;
        this.add = add;
        this.dep = dep;
    }

    void displayc() {
        System.out.print("Name:" + name + "\nAccount no." + ac + "\nAddress:" + add + "\nDeposit:" + dep + "\n ");
    }
}

class Bank {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch, c = 0, p = 0;
        saving s[] = new saving[50];
        current o[] = new current[25];
        while (true) {
            System.out.print("1.Saving Account\n2.Current Account\n3.Display\n4.Exit\n");
            System.out.print("Enter your choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name");
                    String name = sc.nextLine();
                    System.out.print("Enter Account no.");
                    int ac = sc.nextInt();
                    System.out.print("Enter Address");
                    String add = sc.nextLine();
                    System.out.print("Enter Deposit Amount");
                    int dep = sc.nextInt();
                    s[c] = new saving(name, ac, add, dep);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter Name");
                    String nam = sc.nextLine();
                    System.out.print("Enter Account no.");
                    int a = sc.nextInt();
                    System.out.print("Enter Address");
                    sc.nextLine();
                    String ad = sc.nextLine();
                    System.out.print("Enter Deposit Amount");
                    int de = sc.nextInt();
                    o[p] = new current(nam, a, ad, de);
                    break;

                case 3:
                    System.out.print("1.Saving Account\n2.Current Account\n");
                    ch = sc.nextInt();
                    switch (ch) {
                        case 1:
                            for (int i = 1; i <= c; i++) {
                                s[i].displays();
                            }
                            break;

                        case 2:
                            for (int i = 1; i <= p; i++) {
                                o[i].displayc();
                            }
                            break;

                        default:
                            System.out.print("Invalid choice");
                            break;
                    }

                default:
                    System.out.print("Invalid Choice");
                    break;
            }
        }
    }
}