// length(): Returns the number of characters in the string.
// charAt(int index): Returns the character at the specified index.
// equals(Object anObject): Compares the content of two strings.
// concat(String str): Concatenates another string to the end of the current string.
// contains(CharSequence s): Checks if the string contains a specified sequence of characters.
// substring(int beginIndex): Returns a substring starting from the specified index.
// trim(): Removes leading and trailing whitespace from the string.
// split(String regex): Splits the string into an array of substrings based on the given regular expression.

public class String_Class {
    public static void main(String[] args) {

        String str1 = "Hello, World!"; // Auto-Boxing
        String str2 = "Java";

        // length
        System.out.println("Length of str1: " + str1.length());

        // charAt
        System.out.println("Character at index 2 in str2: " + str2.charAt(2));

        // equals
        System.out.println("Is str1 equal to \"Hello, World!\"? " + str1.equals("Hello, World!"));

        // concat
        String concatStr = str1.concat(" Welcome to ").concat(str2);
        System.out.println("Concatenated string: " + concatStr);

        // remove all last and first spaces
        String str3 = "      Hello     ";
        System.out.println("Trim : " + str3.trim());

        // check in given string is there word give is present (return boolean)
        String str4 = "Hello  World";
        System.out.println("" + str4.contains("World"));

        // given index se start hoga and final tak jaayega
        String sub_string = str4.substring(7);
        System.out.println("Substring (index) : " + sub_string);

        // it separate all word by multiple spaces

        System.out.print("Split : ");

        String split_Arr[] = str4.split("\\s+");
        for (String s : split_Arr) {
            System.out.print(" " + s);
        }

    }
}
