interface Mobile {
    void name();

    void company();
}

class Samsung implements Mobile {

    public void name() {
        System.out.println("Samsung Smart Phone");
    }

    public void company() {
        System.out.println("Samsung Company");
    }

}

class Apple implements Mobile {

    public void name() {
        System.out.println("Apple Smart Phone");
    }

    public void company() {
        System.out.println("Apple Company");
    }

}

public class TypeCasting_Interface {
    public static void main(String[] args) {

        Mobile mobile_ref1 = new Samsung();
        Mobile mobile_ref2 = new Apple();

        // Method 1 (Yahape Extra References use ny horhe) (Efficient for arrays)

        /*
         * if (mobile_ref1 instanceof Samsung)
         * {
         * 
         * ((Samsung) mobile_ref1).name();
         * ((Samsung) mobile_ref1).company();
         * 
         * }
         * 
         * if (mobile_ref2 instanceof Apple)
         * {
         * 
         * ((Apple) mobile_ref2).name();
         * ((Apple) mobile_ref2).company();
         * 
         * }
         */

        // Method 2 (Yahape Extra References use ho rhe hai) (Efficient for normal type)

        Samsung samsung_ref = (Samsung) mobile_ref1;
        samsung_ref.name();
        samsung_ref.company();

        Apple apple_ref = (Apple) mobile_ref2;
        apple_ref.name();
        apple_ref.company();

    }
}
