import java.util.*;

class Tower_of_Hanoi {

    public static void TowerofHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("Move Disk 1 from " + src + " to " + dest);
            return;
        } else {
            TowerofHanoi(n - 1, src, dest, help);
            System.out.println("Move Disk " + n + " from " + src + " to " + dest);
            TowerofHanoi(n - 1, help, src, dest);
        }
    }

    public static void main(String args[]) {
        int n = 3;
        TowerofHanoi(n, "S", "H", "D");
    }
}
