
class A implements Runnable {

    public void run() {

        try {

            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }

        catch (InterruptedException e) {

        }

    }

}

class B implements Runnable {

    public void run() {

        try {

            for (int i = 0; i <= 5; i++) {
                System.out.println(i * 10);
                Thread.sleep(1000);
            }
        }

        catch (InterruptedException e) {

        }

    }

}

public class Runnable_Interface {
    public static void main(String[] args) {

        Runnable run_ref1 = new A();
        Runnable run_ref2 = new B();

        Thread t1 = new Thread(run_ref1);
        Thread t2 = new Thread(run_ref2);

        t1.start();
        t2.start();

    }
}
