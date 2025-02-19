
@FunctionalInterface
interface check_even_odd {

    boolean check(int n);

}

public class Even_odd {
    public static void main(String[] args) {

        check_even_odd even_ref = (num) -> num % 2 == 0;

        check_even_odd odd_ref = (num) -> num % 2 != 0;

        int num = 10;

        System.out.println(num + " is even ?  " + even_ref.check(num));
        System.out.println(num + " is Odd ?  " + odd_ref.check(num));

    }
}
