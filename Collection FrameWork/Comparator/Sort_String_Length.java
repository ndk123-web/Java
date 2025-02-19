import java.util.*;

public class Sort_String_Length {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();

        str.add("ndk");
        str.add("op");
        str.add("opas");
        str.add("p");

        Comparator<String> com = new Comparator<>() {

            public int compare(String i, String j) {

                if (i.length() > j.length())
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(str, com);

        System.out.println(str);

    }
}
