public class Clear_Bit {
    public static void main(String[] args) {
        int n = 5;
        int bitmask = 1 << 2;       //AND with Compliment 

        int res = n ^ bitmask;
        System.out.println(res);
    }
}
