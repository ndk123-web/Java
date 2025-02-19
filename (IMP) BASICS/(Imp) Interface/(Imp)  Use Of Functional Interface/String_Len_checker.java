
@FunctionalInterface
interface String_Check {
    boolean checker(String s, int len);
}

public class String_Len_checker {
    public static void main(String[] args) {

        
        String_Check ref = (str, len) -> len == str.length();

        System.out.println(ref.checker("Hello", 5));

    }
}
