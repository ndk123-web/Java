import java.util.Scanner;

class Student {
    private String name, intime, outtime;
    private int roll;

    Student(String name, int roll, String intime) {
        this.name = name;
        this.roll = roll;
        this.intime = intime;
        this.outtime = "Still In";
    }

    String getName() {
        return name;
    }

    void setOuttime(String outtime) {
        this.outtime = outtime;
    }

    void display() {
        System.out.println(
                "Name: " + name + "\nRoll: " + roll + "\nIn time: " + intime + "\nOut time: " + outtime + "\n");
    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int ch, c = 0;
        Student s[] = new Student[30];
        while (true) {
            System.out.println("1.Entry\n2.Exit\n3.Display\n");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (c < s.length) {
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter Name: ");
                        String n = sc.nextLine();
                        System.out.print("Enter In time: ");
                        String in = sc.nextLine();
                        System.out.print("Enter Roll no.: ");
                        int rno = sc.nextInt();
                        s[c] = new Student(n, rno, in);
                        c++;
                    } else {
                        System.out.println("Maximum limit reached");
                    }
                    break;

                case 2:
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String na = sc.nextLine();
                    boolean recordFound = false;
                    for (int i = 0; i < c; i++) {
                        if (s[i].getName().equals(na)) {
                            System.out.print("Enter Out time: ");
                            String ot = sc.nextLine();
                            s[i].setOuttime(ot);
                            recordFound = true;
                            break;
                        }
                    }
                    if (!recordFound) {
                        System.out.println("No record found");
                    }
                    break;

                case 3:
                    if (c == 0)
                        System.out.println("It's empty");
                    else {
                        for (int i = 0; i < c; i++) {
                            s[i].display();
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
