class Str {

    StringBuilder sb = new StringBuilder();

}

public class All_StringBuilder_Methods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb.capacity()); // Extra Capacity deke rehta hai
        System.out.println(sb);

        sb.append(" bhai");
        System.out.println(sb);

        Str s = new Str();
        System.out.println(s.getClass());

        System.out.print(sb.reverse());

        System.out.print(sb.subSequence(1, 4));
    }
}
