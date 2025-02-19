class Area {

    public int area(int a) {    //Method Overloading 
        return a * a;
    }

    public int area(int l, int b) {
        return l * b;
    }
}

public class Meth_Overl {

    public static void main(String[] args) {
        int l = 10;
        int b = 20;

        Area a1 = new Area();
        System.out.println("Area : " + a1.area(l));
        System.out.println("Area : " + a1.area(l, b));
    }
}
