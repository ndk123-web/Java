class MyException extends Exception {

    // Exception class ke pass constructor hai jo String leta hai
    MyException(String st) {
        super(st);
    }

}

public class Custom_Exception {
    public static void main(String[] args) {

        int i = 0, j = 0;

        try {
            j = 18 / 1;
            if (j == 18) {
                throw new MyException("Divide by 0 not possible");
            }
        }

        catch (MyException me) {
            System.out.println(me.getMessage());
        }

    }
}
