import java.util.*;


public class Convert_Base{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.print("Enter String\n");
        a=sc.nextLine();
        char ch;
        StringBuilder convert=new StringBuilder();

        for(int i=0;i<a.length();i++){
            ch=a.charAt(i);

            if(ch>='A' && ch<='Z'){
                convert.append(Character.toLowerCase(ch));
            }
            else if(ch>='a' && ch<='z'){
                convert.append(Character.toUpperCase(ch));
            }
            else{
                convert.append(ch);
            }
        }
        System.out.println(convert);
    }
}