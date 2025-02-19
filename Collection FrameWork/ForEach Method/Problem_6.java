import java.util.Arrays;
import java.util.List;

public class Problem_6 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 4, 5, 3, 20, 70);

        nums.forEach(n -> {
            if (n > 10)
                System.out.println(n);
        });

    }
}
