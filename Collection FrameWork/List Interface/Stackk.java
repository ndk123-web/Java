//Same as arrays
//Mainly Stack class hai bs List ko implement ny krta
//push pop peek itne hee rehte hai

import java.util.*;

public class Stackk {
    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s);
        s.pop();

        System.out.println(s);

        System.out.println(s.peek());

    }
}
