import java.util.*;

public class Sort_last_digit {
    public static void main(String[] args) throws UnsupportedOperationException {

        List<Integer> num = new ArrayList<>();

        // Comparator also need Type and it also Functional Inteferface
        // we can use Anonymous inner class and Lambda expression
        // Inside Comparator we are generating logic how sorting should be done

        Comparator<Integer> com = new Comparator<>() {

            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }

        };

        num.add(13);
        num.add(42);
        num.add(11);
        num.add(16);

        Collections.sort(num, com);

        System.out.println(num);

    }
}