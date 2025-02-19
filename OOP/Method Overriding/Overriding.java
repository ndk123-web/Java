class Calc {

    int add(int n1, int n2) {
        return n1 + n2 + 1;
    }

}

class AdvCalc extends Calc {

    /*
     * int add(int n1, int n2) {
     * return n1 + n2;
     * }
     */

}

public class Overriding {
    public static void main(String[] args) {

        AdvCalc a = new AdvCalc();
        int res = a.add(10, 20);

        System.out.println(res);

    }
}
