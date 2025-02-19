import java.util.Scanner;

class User {
    private String name;

    void setname(String name) {
        this.name = name;
    }

    String getname() {
        return this.name;
    }

}

public class Encapsulation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        System.out.println("Enter Name  ");
        name = sc.nextLine();

        User u = new User();

        u.setname(name);

        System.out.println(u.getname());

    }
}
