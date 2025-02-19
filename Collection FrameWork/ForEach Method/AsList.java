// Creating a List from an Array: The Arrays.asList method takes an array or a comma-separated list of elements and  
// returns a List that is backed by the array.
// This means any changes to the array will be reflected in the list and vice versa.

// Fixed-Size List: The list returned by Arrays.asList is fixed-size, meaning you cannot add or 
// remove elements from it. However, you can change the elements.

import java.util.*;
import java.util.function.Consumer;

public class AsList {
    public static void main(String[] args) {

        // asList is method of Arrays class
        List<Integer> nums = Arrays.asList(1, 2, 4, 6, 7, 9);

        System.out.println(nums);

        // 3 methods to print List

        // 1)
        System.out.println("Normal For Loop");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // 2)
        System.out.println("Enhance For loop");

        for (int n : nums) {
            System.out.println(n);
        }

        // 3)
        System.out.println("For Each Method");

        // For each is method of Iterable interface
        // For each method take argeuement of Consumer Functional interface

        // Consumer<Integer> con = new Consumer<Integer>() {

        // public void accept(Integer n) {

        // System.out.println(n);

        // }

        // };
        // nums.forEach(con);

        
        Consumer<Integer> con = (n) -> System.out.println(n);
        nums.forEach(con);

        nums.forEach(n -> System.out.println(n));

        // nums.forEach( n -> System.out.println(n));

    }
}
