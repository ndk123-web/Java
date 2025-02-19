public class Binary {

    public static boolean check(int arr[], int low,int high, int ip) {
        int mid=low+(high-low)/2;

        if(arr[mid]==ip){
            return true;
        }
        if(arr[mid]>ip){
            return check(arr,low,mid-1,ip);
        }
        else{
            return check(arr,mid+1,high,ip);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 5, 7, 9, 12 };
        int mid = arr.length / 2;
        int ip = 78;
        System.out.println(check(arr, 0, arr.length-1, ip));

    }
}

