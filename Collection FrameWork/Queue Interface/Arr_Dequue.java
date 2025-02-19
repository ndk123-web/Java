import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;

public class Arr_Dequue {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(10); // offer method is a part of Queue interface
        adq.offerFirst(20); // offerFirst method is part of ArrayDequue class
        adq.offerLast(30);

        System.out.println(adq);

        System.out.println("Peek : " + adq.peek());
        System.out.println("Peek First : " + adq.peekFirst());
        System.out.println("Peek Last : " + adq.peekLast());

        System.out.println("Poll : " + adq.poll());
        System.out.println("Poll First : " + adq.pollFirst());
        System.out.println("Poll Last : " + adq.pollLast());

    }
}
