import java.util.Arrays;
import java.util.List;

public class Problem_4 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 4, 5, 3, 2, 7);

        // Print Only Even numbers
        nums.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });

    }
}
