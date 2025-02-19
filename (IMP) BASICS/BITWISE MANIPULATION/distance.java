import java.util.Scanner;
import java.lang.Math;

public class distance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double x1,x2,y1,y2,d;
        System.out.print("Enter x1 y1");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        System.out.print("Enter x2 y2");
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        d=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.print("Distance is :"+d);
    }
}