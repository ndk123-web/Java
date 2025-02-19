// Abstract class can have abstract or non-abstract method
// Abstract class can have final methods
// Abstract class can have Constructor (first abstract )

abstract class Animal { // Its Abstract Class (it exist but cant be use)

    public Animal() { // Constructor of asbtract class
        System.out.println("Its Animal Class");
    }

    abstract void walk(); // Abstract Method

    final void herbivour() { // final method
        System.out.println("Only use in abstract class cause of final keyword");
    }

    void eat() { // Non - Abstract Method
        System.out.println("Animals can Eat ");
    }
}

class Dog extends Animal {
    public void walk() {
        System.out.println("Dog Walk on 4 Legs ");
    }

    // public void herbivour() {             //we cant override
    // System.out.println("hello");
    // }
}

class Cat extends Animal {
    public void walk() {
        System.out.println("Cat Walk on 4 legs ");
    }
}

public class Abstract {
    public static void main(String[] args) {

        Dog d = new Dog(); // constructor called
        Cat c = new Cat(); // constructor called

        d.eat(); 
        c.eat();

        d.walk();
        c.walk();

        d.herbivour(); // same hee rhega ek hee class mein modify ny kr skte
        c.herbivour(); // same hee rhega ek hee class mein modify ny kr skte

    }
}