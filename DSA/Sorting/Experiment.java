public class Experiment {
    public static void main(String[] args) {
        int arr[]={8,3,1,5,4};

        int i=0,j=1;
        if(arr[i]>=arr[j]){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }

        System.out.println(i+" "+j+" "+arr[i]+" "+arr[j]);

        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
