enum Status {

    Failed, Success, Running, Pending;

}

public class Enums_3 {
    public static void main(String[] args) {

        Status s = Status.Running;

        switch (s) {

            case Failed:
                System.out.println("Failed");
                break;

            case Running:
                System.out.println("Running");
                break;

            case Pending:
                System.out.println("Pending");
                break;

            case Success:
                System.out.println("Success");
                break;

            default:
                System.out.println("Invalid");

        }

    }
}
