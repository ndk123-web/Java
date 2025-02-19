// int intValue()
// int compareTo(Integer i)
// static Integer valueOf(int i)
// static Integer valueOf(String s)
// static int parseInt(String s)
// static int parseInt(String s, int radix)
// static String toString(int i)

public class Integer_Class {
    public static void main(String[] args) {

        // Auto - Boxing (Automatic Object create kr leta hai)
        // (Integer int_obj = new Integer(10))
        Integer int_obj = 10;

        // Auto - UnBoxing (Automatic Object ka data assign kr deta hai)
        // (int int_val = int_obj.intvalue())
        int int_val = int_obj;

        System.out.println("int_Obj : " + int_obj);
        System.out.println("int_Value : " + int_val);

        // return object
        Integer int_1 = Integer.valueOf((int) 20);
        System.out.println("ValueOf : " + int_1);

        // return object
        Integer int_2 = Integer.valueOf("120");
        System.out.println("valueOf(String) : " + int_2);

        // return primitive value(Int)
        int int_val1 = Integer.parseInt("10");
        System.out.println("ParseInt(String) : " + int_val1);

        // return primitive value(Int)
        int val_2 = Integer.parseInt("99", int_val1);
        System.out.println("ParseInt(String,DefaultVal) : " + val_2);

        // return primitive value(String)
        String str = Integer.toString(10);
        System.out.println("toString : " + str);
    }
}