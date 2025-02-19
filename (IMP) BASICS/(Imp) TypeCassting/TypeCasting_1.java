// Compile-Time Checking: Java compile-time par reference type ko check karta hai aur us reference type ke methods ko hi directly call karne allow karta hai.
// Type Casting: Agar aapko subclass specific methods call karne hain jo superclass mein nahi hain, to aapko type casting karni hogi.
// Runtime Polymorphism: Runtime par method overriding ka mechanism work karta hai, jisse actual object type ke methods call hote hain.

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Dog {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class TypeCasting_1 {
    public static void main(String[] args) {

      Animal animal=new Dog();  //actual ref Animal type ka hai but object Dog ka hai
      animal.makeSound();   

      Dog dog = (Dog) animal; //actual ref and object is original


    }
}
