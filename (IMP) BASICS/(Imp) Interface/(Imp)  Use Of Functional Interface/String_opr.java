// Reverse , uppercase , remove vowels

@FunctionalInterface
interface StringTransform {

    String transform(String s);

}

public class String_opr {
    public static void main(String[] args) {

        StringTransform rev_ref = (str) -> new StringBuilder(str).reverse().toString();

        StringTransform upper_ref = (str) -> str.toUpperCase();

        StringTransform vowel_ref = (str) -> str.replaceAll("[AEIOUaeiou]", "");

        System.out.println("Reverse : " + rev_ref.transform("hello"));
        System.out.println("Uppercase : " + upper_ref.transform("hello"));
        System.out.println("Remove Vowels : " + vowel_ref.transform("hello"));

    }

}
