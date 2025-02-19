class Base {
    void print1() {
        System.out.println("Its Base class Main");
    }
}

class Derived1 extends Base {

    void print2() {
        System.out.println("Its Base class 2 ");
    }
}

class Derived2 extends Derived1 {
    void print3() {
        System.out.println("Its Child class");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Derived2 d = new Derived2();
        d.print1();
        d.print2();
        d.print3();
    }
}
