// short shortValue()
// int compareTo(Short s)
// static Short valueOf(short s)
// static Short valueOf(String s)
// static short parseShort(String s)

public class Short_Class {
    public static void main(String[] args) throws NumberFormatException {

        Short short_1 = 10; // Auto-Boxing

        short short_val = short_1; // Auto-Unboxing

        System.out.println("Short Value : " + short_val);
        System.out.println("ShortValue : " + short_1.shortValue());

        Short short_2 = 100;
        Short short_3 = 200;

        // compare 2 Short objects and return short_2 - short_3
        System.out.println("Compare short2 and short 3 : " + short_2.compareTo(short_3));

        // return object
        Short short_4 = Short.valueOf((short) 120);
        System.out.println("ValueOf(Short) : " + short_4);

        // return object
        Short short_5 = Short.valueOf("130");
        System.out.println("ValueOf(String) : " + short_5);

        // returns object
        short short_val1 = Short.parseShort("10");
        System.out.println("ParseShort(String) : " + short_val1);

        // Agar String val parse ny huai to short_val1 as a default value store hoga
        short short_val2 = Short.parseShort("1200", short_val1);
        System.out.println("ParseShort(String,default value) : " + short_val2);

        String str = Short.toString(short_val2);
        System.out.println("toString : " + str);

    }
}
