class Mobile {
    int price;
    static String name;
    String company;

    void print() {
        System.out.println(company + " : " + price + " : " + name);
    }

    public static void static_show(Mobile obj) {
        System.out.println(obj.company + " : " + obj.price + " : " + name);
    }

}

public class Static_Method {
    public static void main(String[] args) {

        Mobile m2 = new Mobile();
        Mobile m1 = new Mobile();
        Mobile m3 = new Mobile();

        Mobile.name = "Smart Phone";

        m1.company = "Apple";
        m2.company = "Samsung";
        m3.company = "Nokia";

        m1.price = 1900;
        m2.price = 1700;
        m3.price = 19000;

        m1.static_show(m1); // Using object reference we can use non static variables of static method
        m2.static_show(m2);
        m3.static_show(m3);

    }
}
