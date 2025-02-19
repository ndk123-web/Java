import java.util.*;

class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException r) {

            }
        }
    }
}

public class Multithread_extendsclass {
    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        A t = new A();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException r) {

            }
        }

    }
}