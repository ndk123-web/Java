// Scanner class simply want InputStream object which is(System.in) 
// sc.nextInt() calls the nextInt() method of the Scanner object sc.
// nextInt() waits for the user to enter an integer value from the keyboard.
// Once the user types an integer and presses Enter, nextInt() reads that integer and returns it.
// The returned integer is then stored in the variable n.

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");

        int n = sc.nextInt();

        // Bhai "out" is the static object of printStream class decalres inside the
        // System Class
        // println overloading hai like println mein bahot saare type ke arguement hai
        // like in this "n" is type int which return void but prints on console

        // public void println(String x)
        // ab samje " + " likha hai String Concatation ke liye
        // cause String can take int as well
        System.out.println("Number is " + n);

        // o/p dekhna kya hoga ab -> "n + 12 is : 12(n) 12" - > o/p - > n + 12 is : 1212
        System.out.println("n + 12 is  :  " + n + 12);

    }
}
