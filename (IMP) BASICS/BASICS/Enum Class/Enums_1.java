// name.ordina() gives you index 
// values gives you all constants
// Enum is an class and all constants are our objects   
// We can declare variable and also Constrctors 

//Here enum Status means Status is like an data type

enum Status {

    Running, Pending, Failed, Success;

}

public class Enums_1 {

    public static void main(String[] args) {

        // For print 1 Enum Constant

        // int s = 10 ;
        Status s = Status.Failed;
        System.out.println(s);

        Status st[] = Status.values();

        for (Status ss : st) {
            System.out.println(ss + " : " + ss.ordinal());
        }

    }
}