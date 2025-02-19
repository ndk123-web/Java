import java.util.*;

class student {
    String name, rno, br, div;

    student(String name, String rno, String br, String div) {
        this.name = name;
        this.rno = rno;
        this.br = br;
        this.div = div;
    }

    void display() {
        System.out.print("Name :" + name + "\nRoll :" + rno + "\nBranch :" + br + "\nDivision :" + div + "\n");
    }
}

public class Dene {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name, rno, br, div, chkrno;
        student s[] = new student[10];
        int ch;
        int c = 0;
        while (true) {
            System.out.print("1.Entry\n2.Exit\n3.display\n4.Return Home\n");
            System.out.print("Enter Choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter name");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.print("Enter Roll");
                    rno = sc.nextLine();
                    System.out.print("Enter Branch");
                    br = sc.nextLine();
                    System.out.print("Enter Division");
                    div = sc.nextLine();
                    s[c] = new student(name, rno, br, div);
                    c++;
                    break;

                case 2:
                    System.out.print("Enter Roll");
                    sc.nextLine();
                    chkrno = sc.nextLine();
                    for (int i = 0; i < c; i++) {
                        if (chkrno.equals(s[i].rno))
                            System.out.print("Successfully Exit\n");
                        else
                            System.out.print("Roll Number Not Found \n");
                    }
                    break;

                case 3:
                    for (int i = 0; i < c; i++) {
                        s[i].display();
                    }
                    break;

                default:
                    System.out.print("Invalid choice");
                    break;

            }
        }
    }
}