public class Strings_Memory {
    public static void main(String[] args) {

        // "Ndk" jo hai woh string Constant pool heap mem mein store hua hai
        // Constant mean we cant change that String 
        String s1 = "Ndk";  //(s1==s2)
        String s2 = "Ndk";

        System.out.println(s1 == s2); //True


        // Yahape String ek class hai ooske o1 and o2 objects hai
        // it means o1 diff and o2 diff hai 
        // And Ye Heap memory mein store hai 
        String o1 = new String("op");
        String o2 = new String("");

        System.out.println(o1 == o2); //False
    }
}
