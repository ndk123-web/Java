// abc -> abc,acb,bac,bca,cab,cba

import java.util.*;

public class Permutation{

    public static void perm(String ip,String per){
        
        if(ip.length()==0){
            System.out.println(per);
        }

        for(int i=0;i<ip.length();i++){
            char ch=ip.charAt(i);
            String nip=ip.substring(0, i) + ip.substring(i+1);
            perm(nip,per+ch);
        }
    }

    public static void main(String[] args) {
        String ip="abc";
        perm(ip,"");
    }
}