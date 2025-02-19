import java.util.Arrays;
import java.util.List;

public class Problem_3 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ndk", "Ysh", "Shbm");

        // Uppercase all the Strings
        names.forEach(name -> System.out.println(name.toUpperCase()));

    }
}
