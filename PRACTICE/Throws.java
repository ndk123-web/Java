import java.util.*;

public class Throws {
    static void validate(int age) {
        if (age < 18)
            throw new ArithmeticException("Not Valid");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter age");
        age = sc.nextInt();
        validate(age);
    }
}
