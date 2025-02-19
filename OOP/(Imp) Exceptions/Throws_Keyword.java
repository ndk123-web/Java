// Throws Keyword Applicable method ok Method
// In actual Throws keyword just pass the exception who called that method

class A {

    int div() throws ArithmeticException {
        int i = 0, j = 18;
        return (j / i);
    }

}

class B {

    int array() throws ArrayIndexOutOfBoundsException {

        int arr[] = new int[3];
        return arr[4];

    }

}

class C {

    void check() {

        A a_ref = new A();
        B b_ref = new B();

        try {
            a_ref.div();
        } catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        }

        try {
            b_ref.array();
        }

        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getLocalizedMessage());
        }

    }

}

public class Throws_Keyword {
    public static void main(String[] args) {

        C c_ref = new C();
        c_ref.check();

    }
}
