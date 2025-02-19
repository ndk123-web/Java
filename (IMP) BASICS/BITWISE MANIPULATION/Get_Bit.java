//find at 2nd pos of n which bit present

//i/p 0101  o/p: 1

class Get_Bit {
    public static void main(String[] args) {
        int n = 5;
        int v = 1 << 2; // 1 ko 2 bit se left mein shift kiya v=0100

        int s = n & v;  //(return s=1) 0101 & 0100  return +ve means 1 and return 0 means 0 at index 2
        if (s == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}