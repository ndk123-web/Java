// Lambda extression only work with FunctionalInterface

@FunctionalInterface
interface Ex {

    void run(int i);

}

public class Functional_Interface_1 {
    public static void main(String[] args) {


        // before -> this variables lega 
        // After -> this statements lega
        // agar return krna ho to return ny likhna directly likhna 
        // woh automatic return hoga
        // (->) this is Lambda Expression
        Ex ref1 = (i) -> System.out.println("In new Code " + i);

        ref1.run(10);

    }
}
