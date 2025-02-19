
// synchronized ek keyword hai jisse ek time pe ek hee method call hoga
// agar t1 execute ho rha hai to t2 wait krega 
// agar directly run() kiya to pahila saara ref1 ka poora hoga then ref2 ka (Sequenctialy)
// agar Thread class se start() call kiya to Concurrently mein t1 t2 run() ko call krenge

class C {

    int c = 0;

    public synchronized void count() {
        c++;
    }

}

public class Synchronise_meth {
    public static void main(String[] args) throws InterruptedException {

        C c_ref = new C();

        Runnable ref1 = () -> {

            for (int i = 0; i < 10000; i++) {
                c_ref.count();
            }
        };

        Runnable ref2 = () -> {

            for (int i = 0; i < 10000; i++) {
                c_ref.count();
            }
        };

        Thread t1 = new Thread(ref1);
        Thread t2 = new Thread(ref2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c_ref.c);

    }
}
