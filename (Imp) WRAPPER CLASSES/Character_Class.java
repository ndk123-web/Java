// char charValue()
// int compareTo(Character c)
// static Character valueOf(char c)
// static boolean isLetter(char c)
// static boolean isDigit(char c)
// static char toUpperCase(char c)
// static char toLowerCase(char c)

public class Character_Class {
    public static void main(String[] args) {

        Character char_1 = 'A'; // Auto Boxing

        char char_val = char_1; // Auto-Unboxing

        System.out.println("Char_1 Obj : " + char_1);
        System.out.println("Char_val : " + char_val);

        Character char_2 = 'A';
        Character char_3 = 'B';

        System.out.println("Compare 2 char object : " + char_2.compareTo(char_3));

        Character char_4 = Character.valueOf((char) 'b');
        System.out.println("valueOf(char) : " + char_4);

        boolean check_letter = Character.isLetter('b');
        System.out.println("Check Letter : " + check_letter);

        boolean check_digit = Character.isDigit('1'); // Digit bhai Digit number ny
        System.out.println("Check Digit : " + check_digit);

        char char_val2 = Character.toUpperCase('a');
        System.out.println("UpperCase : " + char_val2);

        char char_val3 = Character.toLowerCase('L');
        System.out.println("LowerCase : " + char_val3);

    }
}
