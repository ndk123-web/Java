
public class Enums_DT {

    public enum Day {
        MON, TUE, WED, THUR, FRI, SAT, SUN;
    }

    public static void main(String[] args) {

        Day day = Day.THUR;

        String name = day.name();

        System.out.println(name);

        Day allDay[] = Day.values();

        for (Day d : allDay) {
            System.out.println(d);
        }

    }
}
