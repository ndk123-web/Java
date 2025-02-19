//Arraylist mein sirf Objects store hote hai kisi bhi class ka like Integer,Float,Character
//ArrayList mein operation hai Like-> add,set,remove,get

import java.util.ArrayList;

public class ArrayList_Fns {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        // add
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // add(location,data)
        list.add(1, 1);
        System.out.println(list);

        // get
        int ele = list.get(0);
        System.out.println(ele);

        // set
        list.set(0, 5);
        System.out.println(list);

        // Iterates
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
