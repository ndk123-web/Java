// byte byteValue()
// int compareTo(Byte b)
// static Byte valueOf(byte b)          //u know why static cause, we can call using class Name Byte [0..0]
// static Byte valueOf(String s)
// static byte parseByte(String s)

public class Byte_Class {
    public static void main(String[] args) {

        // Auto-Boxing
        Byte byte_obj = 10;
        System.out.println("bytevalue : " + byte_obj.byteValue());

        Byte byte_1 = 10;
        Byte byte_2 = 20;

        // return byte1 - byte2 (byte) value
        System.out.println("int compareTo() : " + byte_1.compareTo(byte_2));

        // returns object
        Byte byte_3 = Byte.valueOf((byte) 30);
        System.out.println("ValueOf(byte) : " + byte_3);

        // returns object
        Byte byte_4 = Byte.valueOf("100");
        System.out.println("ValueOf(String) : " + byte_4);

        // return byte value
        byte byte_val = Byte.parseByte("20");
        System.out.println("ParseByte(String) : " + byte_val);

    }
}
