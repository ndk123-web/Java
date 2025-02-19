interface Computer {
    void code();
}

class Laptop implements Computer {

    public void code() {
        System.out.println("code , compile , Run ");
    }

}

class Dekstop implements Computer {

    public void code() {
        System.out.println("code , compiler , Run , faster");
    }

}

class Developer {
    void devapp(Computer ref) {
        ref.code();
    }
}

public class Interface {
    public static void main(String[] args) {

        Computer laptop = new Laptop();

        Computer dekstop = new Dekstop();

        Developer ndk = new Developer();

        ndk.devapp(laptop);

    }
}
