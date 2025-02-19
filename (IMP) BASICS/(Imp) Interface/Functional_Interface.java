// Points to remember is  

// 1 ) FunctionalInterface only takes one non - overriden methods
// 2 ) FunctionalInterface can takes multiple overriden method (equals,hashcode,toString)

@FunctionalInterface // It means it only takes 1 abstract method
interface Ex {

    // Only one abstract method
    void code();

    // FunctionalInterface can take multiple overridden methods (equals, hashCode, toString)
    String toString();  // This is considered an overridden method from Object class
}

class A implements Ex {

    public void code() {
        System.out.println("Coding...");
    }

}

public class Functional_Interface {
    public static void main(String[] args) {

        // method 1 but creates 1 extra anonymous inner class
        Ex ref = new Ex() {

            public void code() {
                System.out.println("In new Coding...");
            }

        };
        ref.code();

        // method 2 where lambda expression use there is no anonymous inner class
        // just creating diff references to perform diff operations (diff objects are
        // creating and implementing in objects)

        /*
         * Ex ref = () -> System.out.println("In new Coding...");
         * 
         * ref.code();
         */

    }
}