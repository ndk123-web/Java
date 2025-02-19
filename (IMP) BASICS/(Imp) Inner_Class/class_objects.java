import java.util.Scanner;

class add {
    int a, b;

    add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void perform() {
        int c = a + b;
        System.out.print("Sum : " + c);
    }
}

public class class_objects {
    public static void class_objects() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 no.");
        a = sc.nextInt();
        b = sc.nextInt();
        add pp = new add(a, b);
        pp.perform();
    }
}
