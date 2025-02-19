// Method overriding bs instance Methods pe hee work hoga static pe nhi
// Only inherited classes mein work krega 
// tab hee work hoga jab parent and child class ke method as it is same honge
// And ye Run time Polymorphism hai it means Many Forms

class Animal {
    public void makesound() {
        System.out.println("Animal make Sound");
    }
}

class Dog extends Animal {

    @Override // Nahi likha tbi bhi chalega but recommended hai

    public void makesound() {
        System.out.println("Dog Barks");
    }
}

public class Meth_Overr_Custom {
    public static void main(String args[]) {

        Animal animal = new Animal();
        Animal mydog = new Dog(); // Animal ka reference dog class ke object ko point kr rha hai

        animal.makesound();
        mydog.makesound();
    }
}