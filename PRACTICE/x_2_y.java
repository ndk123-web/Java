import java.util.*;

class xtoy {
    int xy(int x, int y) {
        if (x == 0)
            return 0;
        if (y == 0)
            return 1;
        if (y == 1)
            return x;
        else
            return xy(x, y - 1) * x;
    }
}

public class x_2_y {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        xtoy v = new xtoy();
        System.out.print("Enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.print("X raise to y :" + v.xy(x, y));
    }
}
