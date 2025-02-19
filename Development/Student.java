import java.util.Scanner;

class op {
    String name, intime, outtime;
    int id;
    Scanner sc = new Scanner(System.in);

    op(String name, String intime, int id, String outtime) {
        this.name = name;
        this.intime = intime;
        this.outtime = outtime;
        this.id = id;
    }

    void entry() {

    }

    void exit() {
        if (find(name) == 1)
            System.out.print("Succesfully exit");
        else
            System.out.print("No records founds");
    }

    int find(String n) {
        if (n.equals(name))
            return 1;
        else
            return 0;
    }

    void display() {
        System.out.print("Name:" + name + "\nId:" + id + "\nintime:" + intime + "\nouttime:" + outtime + "\n");
    }
}

class Student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c = 0, ch;
        op std[] = new op[5];
        while (1) {
            System.out.print("1.Entry\n2.Exit\n3.Display\n");
            System.out.print("Enter choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter name");
                    String name = sc.nextLine();
                    System.out.print("Enter intime");
                    String intime = sc.nextLine();
                    System.out.print("Enter id");
                    int id = sc.nextInt();
                    String outtime = "Still In";
                    c++;
                    std[c] = new op(name, intime, id, outtime);
                    break;

                case 2:
                    System.out.print("Enter name for Exit ");
                    String name = sc.nextLine();
                    std[c].exit();
                    break;

                case 3:
                    std[c].display();
                    break;

                default:
                    System.out.print("Invalid choice");
                    break;

            }
        }

    }
}