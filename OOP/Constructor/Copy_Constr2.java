class Books {

    private String name;
    private String Author;

    Books(String name, String Author) {
        this.name = name;
        this.Author = Author;
    }

    public String getname() {
        return this.name;
    }

    public String getAuthor() {
        return this.Author;
    }

    Books(Books other) {
        this.name = other.name;
        this.Author = other.Author;
    }

}

public class Copy_Constr2 {
    public static void main(String[] args) {

        Books b1 = new Books("Navnath", "Ndk");

        Books b2 = new Books(b1);

        System.out.println("Name : " + b2.getname() + " Author : " + b2.getAuthor());

    }
}
