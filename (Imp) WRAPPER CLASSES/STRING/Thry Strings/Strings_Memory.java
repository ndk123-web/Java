public class Strings_Memory {
    public static void main(String[] args) {

        String s1 = "Ndk";
        String s2 = "Ndk";

        System.out.println(s1 == s2);

        String o1 = new String("op");
        String o2 = new String("");

        System.out.println(o1 == o2);
    }
}
