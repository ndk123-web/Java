import java.util.*;

public class valid_paranth {

    public static boolean check(String inp) {
        
        Stack<Character> st= new Stack<>();

        for(int i=0;i<inp.length();i++){
            char chk=inp.charAt(i);
            
            if(chk=='(' || chk=='{' || chk=='['){
                st.push(chk);
            }
            else
                if(chk==')' || chk=='}' || chk==']' ){
                if(st.isEmpty()){
                    return false;
                }else{
                    char top=st.pop();
                    if((chk==')' && top!='(') || (chk=='}' && top!='{') || (chk==']' && top!='[')){
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();

    }

    public static void main(String[] args) {

        String inp = "({})";
        System.out.println(check(inp));
    }
}
