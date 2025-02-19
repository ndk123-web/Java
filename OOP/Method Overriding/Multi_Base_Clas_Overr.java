class Animal {

    public void makesound() {
        System.out.println("Animal Makes Sound");
    }

    public void print() {
        System.out.println("It is Animal Class");
    }

}

class Dog extends Animal {
    public void makesound() {
        System.out.println("Dog Barks");
    }

    public void print() {
        System.out.println("It is Dog Class");
    }
}

class Cat extends Animal {
    public void makesound() {
        System.out.println("Cat Meow");
    }

    public void print() {
        System.out.println("It is Cat Class");
    }
}

public class Multi_Base_Clas_Overr {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal mydog = new Dog();
        Animal mycat = new Cat();

        animal.print();
        animal.makesound();
        mycat.print();
        mydog.makesound();
        mydog.print();
        mycat.makesound();

    }
}
