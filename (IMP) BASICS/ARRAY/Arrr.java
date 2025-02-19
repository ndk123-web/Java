import java.util.*;

class Arrr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int [10][10];
        int l,m,i,j;

        System.out.print("Enter Matrix");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Matrix is");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=m;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        i=l;
        j=m;
        int s=0;
        s=a[1][1]+a[i][1]+a[1][j]+a[i][j];
        System.out.println("Sum of diagonal :"+s);
        
    }
}