import java.util.*;

class student {
    int rno, m1, m2;
    String name, id;

    student(int rno, String name, String id, int m1, int m2) {
        this.id = id;
        this.rno = rno;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
    }

    void display() {
        System.out.println("Name :" + name);
        System.out.println("Roll : " + rno);
        System.out.println("Id :" + id);
        System.out.println("m1 and m2 marks :" + m1 + "" + m2 + "");
        System.out.println("Total :" + (m1 + m2));
    }
}

public class Tab {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rno, m1, m2;
        int c = 0;
        String name, id;
        student s[] = new student[10];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name");
            name = sc.nextLine();
            System.out.print("Enter Roll");
            rno = sc.nextInt();
            System.out.print("Enter m1 and m2");
            m1 = sc.nextInt();
            m2 = sc.nextInt();
            System.out.print("Enter id");
            sc.nextLine();
            id = sc.nextLine();
            s[i] = new student(rno, name, id, m1, m2);
        }
        for (int i = 0; i < 3; i++) {
            s[i].display();
        }
    }
}