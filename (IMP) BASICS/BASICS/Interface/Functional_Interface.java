
@FunctionalInterface // It means it only takes 1 method
interface Ex {
    void code();
}

class A implements Ex {

    public void code() {
        System.out.println("Coding...");
    }

}

public class Functional_Interface {
    public static void main(String[] args) {

        // Lambda Expression 
        // It will create anonymous class

        Ex ref = () -> System.out.println("In new Coding...");

        ref.code();

    }
}