import java.util.*;

//remove duplicate
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int aa[]=new int[256]; 
        String a;
        int index;
        System.out.print("Enter String");
        a=sc.nextLine();
        char ch;
        
        for(int i=0;i<a.length();i++){
            ch=a.charAt(i);        
            index=a.charAt(i);
            if(aa[index]==0){
                System.out.print(ch);
                aa[index]=1;
            }
        }
    }
}