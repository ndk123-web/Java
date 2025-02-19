// Runnable Interface is Functional Interface
// we can use anonymous inner class and Lambda Expressions

public class Runnable_Ano_class {
    public static void main(String[] args) {

        // Anonymous class created which implements Runnable interface
        Runnable ref1 = new Runnable() {

            public void run() {

                try {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(i);
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e.getLocalizedMessage());
                }
            }
        };

        // Anonymous class created which implements Runnable interface
        Runnable ref2 = new Runnable() {

            public void run() {

                try {
                    for (int i = 1; i <= 5; i++) {
                        System.out.println(i + 1);
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    System.out.println(e.getLocalizedMessage());
                }
            }
        };

        ref1.run();
        ref2.run();

    }
}