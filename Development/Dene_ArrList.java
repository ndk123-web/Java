import java.util.*;

class Student {

    private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getname() {
        return this.name;
    }

    public String getid() {
        return this.id;
    }

}

public class Dene_ArrList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        int ch;
        boolean found = false;
        String name, id, cid;

        while (true) {
            System.out.println("1.Entry\n2.Exit\n3.Display\n4.Return");

            try {
                System.out.print("Enter Choice : ");
                ch = sc.nextInt();
                sc.nextLine();

                switch (ch) {

                    case 1:
                        System.out.print("Enter Name : ");
                        name = sc.nextLine();
                        System.out.print("Enter Id : ");
                        id = sc.nextLine();

                        students.add(new Student(name, id));
                        break;

                    case 2:
                        System.out.print("Enter Id For Exit : ");
                        cid = sc.nextLine();

                        for (Student s : students) {
                            if (cid.equals(s.getid())) {
                                found = true;
                                System.out.println("SuccessFully Exit");
                                break;
                            }
                        }
                        if (found == false) {
                            System.out.println("Id Not Found");
                        }
                        break;

                    case 3:
                        for (Student s : students) {
                            System.out.println("Name : " + s.getname() + "  Id : " + s.getid());
                        }
                        break;

                    case 4:
                        return;

                    default:
                        System.out.println("Invalid Choice");

                }
            } catch (InputMismatchException e) {
                System.out.println("It Should be Choice ");
                return;
            }
        }
    }
}
