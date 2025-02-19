
public class Try_Catch {
    public static void main(String[] args) {

        int i = 0, j = 0;

        try {
            j = 18 / i;
        }

        catch (ArithmeticException e) { // ye catched kr rha hai exception ko
            System.out.println(e.getMessage());
        }

        System.out.println("TATA");

    }
}