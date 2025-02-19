public class Runnable_Lambda {
    public static void main(String[] args) {

        Runnable ref1 = () -> {

            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        };

        // Before -> this there is arguement
        // After -> this statement are there for method run() of Interface Runnable
        // Lambda Expression Supports cause Interface Runnable is FunctionalInterface
        Runnable ref2 = () -> {

            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i + 1);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                System.out.println(e.getLocalizedMessage());
            }
        };

        ref1.run();
        ref2.run();

    }
}
