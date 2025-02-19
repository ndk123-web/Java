// when you want to implement only once aany operation then use anonymous class

class A {

    void show() {
        System.out.println("In A Show");
    }

}

public class Anonymous_Class {
    public static void main(String[] args) {

        // New Implementation of Anonymous class only for "obj"
        A obj = new A() {

            void show() {

                System.out.println("In Anonymous show");

            }

        };

        obj.show(); // Anonymous class ka show method ka boola rha hai

        // for obj1 it will create class A object 'obj1'
        A obj1 = new A();
        obj1.show();

    }
}
