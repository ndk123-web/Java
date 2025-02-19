
@FunctionalInterface
interface Ex {

    int add(int i, int j);

}

public class Functional_Interface_2 {
    public static void main(String[] args) {

        Ex ref = (i, j) -> i + j;

        int res = ref.add(10, 20);
        System.out.println(res);
    }
}
