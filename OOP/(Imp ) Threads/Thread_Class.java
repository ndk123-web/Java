// class A and B jo hai ab Thread bn gaya hai
// class ka object banaya hai A and B jisme Thread ki Properties hai
// run method use for simultaneous operation 
// start method just use for to start the run method

class A extends Thread {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
        }
    }

}

class B extends Thread {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
        }
    }

}

public class Thread_Class {
    public static void main(String[] args) {

        B b_ref = new B();
        A a_ref = new A();

        a_ref.start();
        b_ref.start();

    }
}