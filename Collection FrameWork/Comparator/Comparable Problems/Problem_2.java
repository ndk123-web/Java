import java.util.*;

class Book implements Comparable<Book> {

    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
    }

    public int compareTo(Book that) {
        return this.title.compareTo(that.title);
    }

}

public class Problem_2 {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Marathi", "Ndk", 1200));
        books.add(new Book("Sanskrit", "Ysh", 1));
        books.add(new Book("Maths", "Shbm", 1200));

        Collections.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }

    }
}
