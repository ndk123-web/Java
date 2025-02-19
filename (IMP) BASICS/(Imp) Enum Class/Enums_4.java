enum Laptop {

    Lenovo(1000), HP(1020), Apple(1900);

    private int price;

    Laptop(int price) {
        this.price = price;
    }

    void getprice(int price) {
        this.price = price;
    }

    int getprice() {
        return this.price;
    }

}

public class Enums_4 {
    public static void main(String[] args) {

        Laptop lap = Laptop.Lenovo;

        for (Laptop l : Laptop.values()) {
            System.out.println(l + " : " + l.getprice());
        }

    }
}