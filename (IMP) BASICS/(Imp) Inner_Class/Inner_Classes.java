class A {

    void showA() {
        System.out.println("In A Show");
    }

    class B {

        void showB() {
            System.out.println("In B Show");
        }

        class C {

            void showC() {
                System.out.println("In C Show");
            }
        }
    }
}

public class Inner_Classes {
    public static void main(String[] args) {

        A obj = new A();
        obj.showA();

        A.B obj1 = obj.new B();
        obj1.showB();

        A.B.C obj2 = obj1.new C();
        obj2.showC();

    }
}
