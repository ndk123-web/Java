public class Ex {

    public static void print1(int n){
        System.out.println(2);
        print2(3);
    }

    public static void print2(int n){
        System.out.println(3);
        print3(4);
    }

    public static void print3(int n){
        System.out.println(4);
    }

    public static void main(String[] args) {
        System.out.println(1);
        print1(2);
    }
}
