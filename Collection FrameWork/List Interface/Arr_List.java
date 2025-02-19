// Collection inteferface hai and oosko 3 interface extends krte hai
// Set,List,Queue is interface that extends Collection
// Map is not part of Collection but it is the combination of List and Set 

import java.util.*;

public class Arr_List {
    public static void main(String args[]) {

        // List Interface hai jiska object and constructor ny hota
        // ArrayList Class hai List Interface ko implement kiya hai
        // ArrayList ka Object "list" bana diya hai
        List<Integer> list = new ArrayList<>();

        // add method jo List Interface ka method hai implement ArrayList mein kiya hai
        // Syntax : list.add(data);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        // Syntax : list.add(index,data);
        list.add(1, 50);
        System.out.println(list);

        List<Integer> newlist = new ArrayList<>();
        newlist.add(100);
        newlist.add(200);

        // Syntax Origllist.addAll(TempList);
        list.addAll(newlist);
        System.out.println(list);

        // Syntax : list.get(index);
        System.out.println(list.get(5));

        // Syntax : list.remove(index);
        System.out.println(list.remove(5));

        // Special case
        // Integer type ka data hai 30 isse as a object return kr rhe hai
        System.out.println(Integer.valueOf(30));

        // Set bas update krta hai value
        System.out.println(list.set(1, 300));
        System.out.println(list);

        // 3 Types of Iteration
        System.out.println("Normal Loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        // Objects pass kiya hai and waise hee data print horha hai object ka
        System.out.println("For Each Object loop");
        for (Integer obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
        System.out.println();

        // Itereator interface hai bahoot se collection classes ne implement kr rkha hai
        // .hasNext() means return true agar current data hoga to yaa return false
        // .next means data print krte rhega
        // .remove means remove krta hoga
        System.out.println("Iterator Interface");
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}