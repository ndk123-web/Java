// name.ordina() gives you index 
// values gives you all constants
// Enum is an class and all constants are our objects

enum Status {

    Running, Pending, Failed, Success;

}

public class Enums_1 {

    public static void main(String[] args) {

        // For print 1 Enum Constant
        Status s = Status.Failed;
        System.out.println(s);

        Status st[] = Status.values();

        for (Status ss : st) {
            System.out.println(ss + " : " + ss.ordinal());
        }

    }
}