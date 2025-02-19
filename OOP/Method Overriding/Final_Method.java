class A {

    final void show() {
        System.out.println("In A Show");
    }

}

class B extends A {

    // void show(){
    // System.out.println("In B Show"); // We cant override the method of superclass
    // } // cause that method is final(we cant override that method)

}

public class Final_Method {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
