import java.util.*;

public class Desc_Compar {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(5);
        num.add(56);
        num.add(13);
        num.add(2);

        Comparator<Integer> com = new Comparator<>() {

            public int compare(Integer i, Integer j) {

                if (i < j)
                    return 1;
                else
                    return -1;
            }

        };

        Collections.sort(num, com);

        System.out.println(num);

    }
}
