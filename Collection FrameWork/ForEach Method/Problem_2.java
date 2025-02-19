import java.util.Arrays;
import java.util.List;

public class Problem_2 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 4, 5, 3, 2, 7);
        int sum[] = { 0 };

        nums.forEach(n -> sum[0] += n);

        System.out.println(sum[0]);
    }
}
