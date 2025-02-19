import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_last_digit_Lambda {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        // Comparator also need Type and it also Functional Inteferface
        // we can use Anonymous inner class and Lambda expression
        // Inside Comparator we are generating logic how sorting should be done
        
        Comparator<Integer> com = (Integer i, Integer j) -> {
            if (i % 10 > j % 10)
                return 1;
            else
                return -1;
        };

        num.add(13);
        num.add(42);
        num.add(11);
        num.add(16);

        Collections.sort(num, com);

        System.out.println(num);

    }
}
