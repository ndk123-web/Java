// new A() triggers the creation of a new class that extends A.
// { void show() { ... } } provides the implementation of the abstract method show() in the new subclass.
// The new subclass does not have a name, hence it is called an anonymous inner class.
// An instance of this anonymous inner class is created and assigned to the variable obj.

abstract class A {

    abstract void show();

}

public class Anonumous_Abstract_Class {
    public static void main(String[] args) {

        // object create ho rha hai anonymous class ka and obj mein assign ho rha hai
        // (anonymous class extends class A)

        A obj = new A() { // new A() means ek anonymous subclass create kiya

            void show() {

                System.out.println("In new Show");

            }

        };

        obj.show();

    }
}
