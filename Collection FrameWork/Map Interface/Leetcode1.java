import java.util.*;

// Inp : aaa,aa,a  and k=2    Oup=aa

public class Leetcode1 {

    public static String toFind(String arg[],int k){
        Map<String,Boolean> map = new HashMap<>();

        for(int i=0;i<arg.length;i++){
            if(map.containsKey(arg[i])){
                map.put(arg[i], false);
            }else{
                map.put(arg[i],true);
            }
        }
        int c=0;

        for(int i=0;i<arg.length;i++){

            if(map.get(arg[i])==true){
                c++;
                if(c==k){
                    return arg[i];
                }
            }
        }
        
        return "";
    }

    public static void main(String[] args) {
        String arg[]={"b","a","c","a","d","c"};
        int k=2;
        String res = toFind(arg,k);
        System.out.println(res);
    }
}
