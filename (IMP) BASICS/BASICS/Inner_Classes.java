// class A ke andar B ke andar C hai
// class A ko simple hai simplly object banao A ka and showA() ko call krdo
// class B ke liye woh class A ka part hai means class A ka object se class B ka object krna pdega
// class C ke liye woh class B ka part hai means class B ka object se class C ka object krna pdega
// Only inner classes hee static reh skte hai

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
