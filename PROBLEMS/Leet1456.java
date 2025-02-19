import java.util.*;

// Input: s = "abciiidef", k = 3
// Output: 3

public class Leet1456 {

    public static boolean check(char chk){
        return (chk=='a' || chk=='e' || chk=='i' || chk=='o' || chk=='u');
    }

    public static int maxvowel(String inp,int k){

        int maxvw=0,curr=0;
        for(int i=0;i<k;i++){
            if(check(inp.charAt(i))){
                curr++;
            }
        }

        maxvw=Math.max(curr,maxvw);

        for(int i=k;i<inp.length();i++){
            if(check(inp.charAt(i-k))){
                curr--;
            }
            if(check(inp.charAt(i))){
                curr++;
            }
            maxvw = Math.max(curr,maxvw);
        }
        return maxvw;
    }

    public static void main(String[] args) {
        
        String inp = "abiijk";
        int k=3;

        int maxvw = maxvowel(inp,k);
        System.out.println("Max Vowles : "+maxvw);

    }   
}
