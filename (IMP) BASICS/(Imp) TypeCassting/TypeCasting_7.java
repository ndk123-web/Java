class Animal {

    void show() {
        System.out.println("Its Animal Show");
    }

}

class Cat extends Animal {

    void show() {
        System.out.println("Its Cat Show");
    }

    void sound() {
        System.out.println("Meow");
    }

}

class Dog extends Animal {

    void show() {
        System.out.println("Its Dog Show");
    }

    void sound() {
        System.out.println("Barks");
    }

}

public class TypeCasting_7 {
    public static void main(String[] args) {

        Animal animal_ref1 = new Dog();
        Animal animal_ref2 = new Cat();



        // Method 1 to Typecast (No extra ref required)
        // Ye check krega apna ref konse object ko point(instance) kr rha hai  

 /*        if (animal_ref1 instanceof Dog) {
            ((Dog) animal_ref1).show();
            ((Dog) animal_ref1).sound();
        }

        if (animal_ref2 instanceof Cat) {
            ((Cat) animal_ref2).show();
            ((Cat) animal_ref2).sound();
        }                                       */



        // Method 2 to Typecast (Extra ref required)
        // dog_ref and cat_ref ye 2 reference lage

        Dog dog_ref=(Dog) animal_ref1;
        dog_ref.show();
        dog_ref.sound();

        Cat cat_ref= (Cat) animal_ref2;
        cat_ref.show();
        cat_ref.sound();


    }
}
