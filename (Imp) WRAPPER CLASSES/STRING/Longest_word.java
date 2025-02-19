import java.util.*;

class Longest_word{

    public static String findlongword(String a){
        int st=0;int end=0; int max=0 int c=1; int maxst=0; int maxend=0;
        char ch;
        StringBuilder convert=new StringBuilder();
        for(int i=0;i<a.length();i++){
            ch=a.charAt(i);
            if(i==a.length() || ch==' ' ){
                end=i-1;
                c=end-st+1;
                if(max<c){
                    max=c;
                    maxst=st;
                    maxend=end;
                }
            }
            st=i+1;
        }
        for(int i=maxst;i<=maxend;i++){
            convert.append(a.charAt(i));
        }
        return convert.toString;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a;
        System.out.print("Enter String");
        a=sc.nextLine();
        String longword=findlongword(a);
        System.out.print(longword);
    }
}