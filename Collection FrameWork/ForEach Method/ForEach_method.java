// ForEach method is method of Iterable Interface
// It takes parameter as Consumer Functional Interface
// it is Functional Interface i.e. void accept(Type obj) has the only method
// nums.forEach(Consume obj) forEach values provide krta hai
// Consumer oos values ke sath kya krna hai woh krta hai

import java.util.ArrayList;
import java.util.List;

public class ForEach_method {
    public static void main(String[] args) {

        List <Integer> nums = new ArrayList<>();
        
        nums.add(1);
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(4);

        // n-> System.out.println(n) all automaticallt is inside the anonymous class of method void accept(Integer)
        // automatically creates object of anonumous class who implements Consumer interface
        // it automaticaly Detects n is type of Integer
        // There we used Lambda Expression 
        // Simply forEach method gives values to Consumer object 'n' and it does operations like print of anything

        nums.forEach( n-> System.out.println(n) );


    }
}
