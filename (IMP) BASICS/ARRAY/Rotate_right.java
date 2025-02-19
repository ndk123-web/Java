import java.util.*;

public class Rotate_right {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]=new int [5];
        int t,i;
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        t=a[i-1];
        for(i=1;i<5;i++)
        {
            a[i]=a[i+1];
        }
        a[0]=t;
        for(i=0;i<5;i++)
        {
            System.out.print(a[i]+"\n");
        }

    }
}

