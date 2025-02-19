// sorted and unsoted

// 23 1 10 5 2 -> 1 23 10 5 2 -> 1 10 23 5 2 -> 1 2 5 10 23

// |23| | 1 10 5 2 |
// 

public class Insertion {
    public static void main(String[] args) {
        int arr[]={23,1,10,5,2};

        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j]=key;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
