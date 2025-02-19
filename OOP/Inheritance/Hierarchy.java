class A {
    void print() {
        System.out.println("Its class A");
    }
}

class B1 extends A {
    void print1() {
        System.out.println("Its class B1");
    }
}

class B2 extends A {
    void print2() {
        System.out.println("Its class B2");
    }
}

public class Hierarchy {
    public static void main(String[] args) {
        B1 b = new B1();
        B2 bb = new B2();
        b.print();
        bb.print();
    }
}
