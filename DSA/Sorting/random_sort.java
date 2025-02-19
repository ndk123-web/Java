public class random_sort {

    public static int check(int num[],int n){
        int st=0,end=num.length-1,m1=num.length/2;
        int m2=m1;

        while(st<=m1){
            if(num[st]==n || num[m1]==n){
                return 1;
            }else{
                st++; m1--;
            }
        }
        while(m2<=end){
            if(num[end]==n || num[m2]==n){
                return 1;
            }else{
                end--; m2++;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int num[]={6,2,9,11,45,86,23,43};
        int flag=check(num,9);

        if(flag==1){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }
    }
}
