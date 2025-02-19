class Base {

    public void sum() {
        int a = 10;
        int b = 20;
        System.out.println("Its Base class");
        System.out.println("Sum is " + (a + b));
    }
}

class Derived extends Base {

    void derive() {
        System.out.println("Its derived Class");
    }

}

public class Simple_Inheritance {
    public static void main(String args[]) {
        Derived d = new Derived();
        d.derive();
        d.sum();
    }
}
