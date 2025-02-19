//    Queue<Integer> q = new LinkedList<>();
//    Queue<Integer> q isme 'q' ek reference hai Queue Interface ka 
//    LinkedList<>() ye ek class hai jo Queue interface ko implement krta hai
//    new LinkedList<>() ye ek Object create kiya hai LL ka jisse q point kr rha hai     
//    in short LL,PQ,AD in sabme Queue ke methods hai kyuki 3no classes implement krti hai apne Queue interface ko

import java.util.*;

public class Collection_Fram {
    public static void main(String args[]) {

        // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new PriorityQueue<>(); //Queue Interface hai jo in 3
        // classe oose implement krte hai
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }

    }
}
