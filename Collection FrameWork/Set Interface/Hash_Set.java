import java.util.*;

import java.util.HashSet;

public class Hash_Set {
    public static void main(String[] args) {

        Set<Integer> hash = new HashSet<>();

        // Random order mein Data store honge
        hash.add(10);
        hash.add(20);
        hash.add(30);
        hash.add(40);

        // It can't be Add cause only 1 copy in set
        hash.add(40);
        System.out.println(hash);

        hash.remove(10);
        System.out.println(hash);

        System.out.println(hash.contains(10)); // if it contains return true else return false

        hash.isEmpty(); // return true if empty else return false

        // To clear the all the elements
        hash.clear();
        System.out.println(hash);

    }
}