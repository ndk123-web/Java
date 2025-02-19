import java.util.*;

class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

public class Multithread_interface {
    public static void main(String args[]) throws InterruptedException {
        A r = new A();
        Thread t = new Thread(r);
        t.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}