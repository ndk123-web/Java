// Custom Sorting Logic:
// Create a class Product with attributes productId, productName, and price.
// Implement a Comparator<Product> to sort products based on a custom logic (e.g., by price descending, or by name length).
// Test the sorting using Collections.sort() with different Comparator implementations.

import java.util.*;

class Product {

    int pid;
    String pname;
    float price;

    public Product(int pid, String pname, float price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
    }

    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
    }

}

public class Problem_2 {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(123, "Kurkure", 10));
        products.add(new Product(122, "Lays", 50));
        products.add(new Product(127, "Chatakapataka", 10));
        products.add(new Product(124, "fries", 20));
        products.add(new Product(121, "bros", 30));

        Comparator<Product> com = (i, j) -> {
            return (i.pid - j.pid);
        };

        Collections.sort(products, com);

        for (Product p : products)
            System.out.println(p);

    }
}
