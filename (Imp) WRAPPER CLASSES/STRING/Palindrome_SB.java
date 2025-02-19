import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.print("Enter String");
        a=sc.nextLine();
        StringBuilder n=new StringBuilder(a);
        
        n.reverse();
        
        if(a.equals(n.toString())){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not Palindrome");
        }
    }
}