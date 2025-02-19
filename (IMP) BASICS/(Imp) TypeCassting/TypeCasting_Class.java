class A {

    void show1() {
        System.out.println("In A Show");
    }

}

class B extends A {

    void show2() {
        System.out.println("In B Show");
    }

}

public class TypeCasting_Class {
    public static void main(String[] args) {

        A obj = new B();

        B obj1 = (B) obj;
        obj1.show1();
        obj1.show2();

    }
}
