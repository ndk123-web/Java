import java.util.Scanner;

class N1{
    public void meth(){
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       StringBuilder op = new StringBuilder(s);

       if(s.startsWith("print(\"") && s.endsWith("\")") ){
            int st=s.indexOf("\"")+1;
            int end = s.length()-2;
            System.out.println(s.substring(st, end));
       }
       else{
        System.out.println("Syntax Error");
       }
    }
}

class N2{

    public static N1 n1_obj = new N1();

}

public class Class_Obj{
    public static void main(String[] args) {
      
      while(true){
      N2.n1_obj.meth(); 
      }
    }
}
