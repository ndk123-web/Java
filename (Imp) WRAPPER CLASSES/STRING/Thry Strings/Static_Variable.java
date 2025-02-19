class Mobile {
    int price;
    String name;
    static String comp;

    void print() {
        System.out.println(name + " : " + price + " : " + comp);
    }

}

public class Static_Variable {
    public static void main(String[] args) {

        Mobile.comp = "Smart Phone";

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();
        m1.name = "Apple";
        m2.name = "Samsung";
        m3.name = "Nokia";

        m1.price = 1900;
        m2.price = 1700;
        m3.price = 19000;

        m1.print();
        m2.print();
        m3.print();

    }
}
