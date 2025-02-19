import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Intr {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(9);
        num.add(10);
        num.add(1);
        num.add(5);

        // Collections is class
        // we can apply our own logic in sort using Comparator Interface
        // comparator is FunctionalInterface

        Collections.sort(num);

        System.out.println(num);

    }
}