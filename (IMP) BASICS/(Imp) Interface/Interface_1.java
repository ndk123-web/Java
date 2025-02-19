interface X {
    void code();

    void run();
}

interface Y {
    void compile();
}

class A implements Y, X {

    public void code() {
        System.out.println("Coding...");
    }

    public void run() {
        System.out.println("Running ...");
    }

    public void compile() {
        System.out.println("Compiling...");
    }
}

public class Interface_1 {
    public static void main(String[] args) {

        X x_ref = new A();
        x_ref.code();
        x_ref.run();

        Y y_ref = new A();
        y_ref.compile();

    }
}
