
import java.util.Scanner;

public class Enums_DT {

    public enum Day {
        MON, TUE, WED, THUR, FRI, SAT, SUN;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String ip;

        //yahape Day enum ka day refernce banaya hai jisme THUR store hai
        Day day = Day.THUR;
        String name = day.name();   //obj.name() se String mein Constant le skte hai
        System.out.println(name);


        //Day enum hai jiska array type Day hai reference alldays hai jisme all constant store hai
        Day allDay[] = Day.values();    //Day.values Store hota hai array mein store krne ke liye 
        for (Day d : allDay) {
            System.out.println(d);
        }

        System.out.println("Enter ip");
        ip=sc.nextLine();

    }
}
