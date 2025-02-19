
@FunctionalInterface
interface Ex {

    void run(int i);

}

public class Functional_Interface_1 {
    public static void main(String[] args) {

        Ex ref1 = (i) -> System.out.println("In new Code " + i);

        ref1.run(10);

    }
}
