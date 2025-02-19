import java.util.*;

// inp - zelle ,  op - 26+5+12+12+50 = 60

public class Sample{

    public static int checkchar(char key){
        return key - 'a' + 1;
    }

    public static void main(String args[]){

        int sum=0;
        String inp = "zelle";
        inp.toLowerCase();
        for(int i=0;i<inp.length();i++){
            sum+=checkchar(inp.charAt(i));
        }

        System.out.println("Sum : "+sum);

    }
}