//Dene System 

import java.util.Scanner;

class Dene {
    private String name;
    private String id, checkid;

    Dene(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getname() { // getter and setter use for to get private datas
        return this.name;
    }

    public String getid() { // getter and setter use for to get private datas
        return this.id;
    }

}

public class Use_Of_Constru {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c = 0;
        String name;
        String id, checkid;
        int ch;

        Dene d[] = new Dene[10]; // Array Of Objects

        while (true) {

            System.out.println("1.Entry\n2.Exit\n3.Return\n");
            System.out.println("Enter Choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    if (c > 9) {
                        System.out.println("Its Full\n");
                        return;
                    }
                    System.out.println("Enter Name");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter Id");
                    id = sc.nextLine();
                    d[c] = new Dene(name, id);
                    c++;
                    break;

                case 2:
                    System.out.println("Enter Your Id");
                    sc.nextLine();
                    checkid = sc.nextLine();
                    for (int i = 0; i <= c; i++) {
                        if (d[i].getid().equals(checkid)) {
                            System.out.println("Successfully Exit");
                            break;
                        }
                        System.out.println("Not Found");
                        break;
                    }
                    break;

                case 3:
                    return;

                default:
                    System.out.println("Invalid Choice");

            }
        }
    }
}