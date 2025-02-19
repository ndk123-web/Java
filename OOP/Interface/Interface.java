//interface ka constructor ny hota
//interface ka object bhi ny hota
//variable By default public static final hai (Variable)
//methods By deafault abstract method hoga
//Multiple inheritance possible using interface

interface Animal { // Interface hai Animal name ka

    int a = 10; // By default public static final hai (Variable)

    void sound(); // By deafault abstract method hoga

    void sleep(); // By deafault abstract method hoga

    void eat(); // By deafault abstract method hoga

}

class Dog implements Animal { // to access interface need to write "implement" keyword

    @Override
    public void sound() { // override krne ke liye public likhna pdega
        System.out.println("Dog Barking");
    }

    @Override
    public void eat() { // override krne ke liye public likhna pdega
        System.out.println("Dog Eating");
    }

    @Override
    public void sleep() { // override krne ke liye public likhna pdega
        System.out.println("Dog Sleeping");
    }

}

public class Interface {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.eat();
        dog.sleep();

    }
}