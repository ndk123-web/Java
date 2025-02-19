class Swap {

    int a, b;

    Swap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void swap(Swap s1) {
        int t = s1.a;
        s1.a = s1.b;
        s1.b = t;
    }

}

public class Swap_Obj {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Swap s1 = new Swap(a, b);
        System.out.println("Before a: " + s1.a + " b: " + s1.b);
        s1.swap(s1);
        System.out.print("After a: " + s1.a + " b: " + s1.b);
    }
}