import java.util.*;

public class Pri_dequeue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(20); // return false if add fails
        pq.add(30); // Throw exception if add fails
        pq.add(40);

        System.out.println(pq);

        pq.poll(); // return null if queue empty
        pq.remove(); // throw exception if queue empty

        System.out.println(pq);

        System.out.println(pq.peek()); // returns top of queue

    }
}