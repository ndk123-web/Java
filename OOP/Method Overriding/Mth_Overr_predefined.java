
class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public boolean equals(User a2) {
        if (this.getname() == a2.getname()) {
            return true;
        } else {
            return false;
        }
    }
}

public class Mth_Overr_predefined {
    public static void main(String args[]) {

        User a1 = new User("Ndk");
        User a2 = new User("ndk");

        System.out.println(a1.getname().equals(a2.getname()));

    }
}
