// TO = n*n!

public class Permutation{

    public static void backtrack(String str,String perm){

        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i=0;i<str.length();i++){
            char currchar=str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            backtrack(newstr,perm+currchar);
        }

    }

    public static void main(String[] args) {
        
        String str="ABC";
        backtrack(str,"");

        System.out.println("All Arguements that are passed to Terminal : ");
        for(String i : args){
            System.out.print(i + " ");
        }

    }
}