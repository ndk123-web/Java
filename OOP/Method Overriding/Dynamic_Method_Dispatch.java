class A {

    void show() {
        System.out.println("In A Show");
    }

}

class B extends A {

    void show() {
        System.out.println("In B Show");
    }

}

class C extends A {

    void show() {
        System.out.println("In C Show");
    }

}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }
}
