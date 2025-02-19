import java.util.Scanner;

public class Enums_Adv {

    public enum Day {
        MON, TUE, WED, THUR, FRI, SAT, SUN; //All must be Uppercase
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inp;
        System.out.println("Enter Week Day");
        inp = sc.nextLine().toUpperCase();

        Day day = Day.valueOf(inp);

        switch (day) {
            case MON:
                System.out.println("Its Monday");
                break;
            case TUE:
                System.out.println("Its Tuesday");
                break;
            case WED:
                System.out.println("Its Wednesday");
                break;
            case THUR:
                System.out.println("Its Thursday");
                break;
            case FRI:
                System.out.println("Its Friday");
                break;
            case SAT:
                System.out.println("Its Saturday");
                break;
            case SUN:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("Invalid Input");
        }

    }
}
