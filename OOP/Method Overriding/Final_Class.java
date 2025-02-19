final class A {
    void show() {
        System.out.println("In A Show");
    }
}

class B extends A { // u see we cant inherit the final class
    void show() {
        System.out.println("In B Show");
    }
}

public class Final_Class {
    public static void main(String[] args) {

    }
}
