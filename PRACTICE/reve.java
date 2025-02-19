import java.util.Scanner;

public class reve {

    public static void rever(String inp){
        StringBuffer in = new StringBuffer(inp);
        int st=0,end=in.length()-1;
        String check="ARIOUaeiou";

        while(st<end){
            String key = inp.charAt(st);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String inp;
        System.out.println("Enter String");
        inp=sc.nextLine();

        rever(inp);
    }
}
