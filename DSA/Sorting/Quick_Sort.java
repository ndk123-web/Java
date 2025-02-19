    // 5,3,1,8,9  -> 5 3 1 8 9 
    // 1 3 5 8 9 
    public class Quick_Sort {

        public static void quicksort(int arr[], int st, int end) {

            if (st < end) {

                int p = partition(arr, st, end);
                
                quicksort(arr, st, p - 1);
                quicksort(arr, p + 1, end);
            }
        }

        public static int partition(int arr[], int st, int end) {
            int piv = arr[st];
            int piv_loc = st;

            for (int i = st + 1; i <= end; i++) {
                if (arr[i] <= piv) {
                    st = st + 1;
                    int t = arr[i];
                    arr[i] = arr[st];
                    arr[st] = t;
                }
            }
            int t = arr[piv_loc];
            arr[piv_loc] = arr[st];
            arr[st] = t;

            return st;
        }

        public static void main(String args[]) {
            int arr[] = {5,3,2,4,1};

            quicksort(arr, 0, arr.length-1);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(" " + arr[i]);
            }
        }
    }