enum Status {

    Failed, Success, Pending, Running;

}

public class Enums_2 {
    public static void main(String[] args) {

        Status s = Status.Failed;

        if (s == Status.Running) {
            System.out.println("Its Running");
        } else if (s == Status.Pending) {
            System.out.println("Its Pending");
        } else if (s == Status.Success) {
            System.out.println("Its Success");
        } else {
            System.out.println("Failed");
        }

    }
}
