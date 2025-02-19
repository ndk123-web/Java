import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
      
        int i=0,j=0,k=0;
        String op="";

        if(s.length()==0){
            return true;
        }

        // j points to s 
        // i points to t

        // s = abc    t = ahbgdc     op = true

        for(i=0;i<t.length();i++){
            if(t.charAt(i) == s.charAt(j)){
                char key = s.charAt(j);
                op=op+key;
                j++;
            }
        }

        if(op.length() == s.length() )
        return true;
        else
        return false;

    }
}

public class Subseq{
    public static void main(String[] args) {
        String s = "abc";
        String t="ahbgdc";
        Solution sol = new Solution();
        sol.isSubsequence(s, t);
    }
}