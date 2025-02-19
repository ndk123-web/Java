import java.util.*;

public class leet1 {
    public static void main(String[] args) {
        
        Set<Integer> s=new HashSet<>();
        int arr[]={1,1,2};

        for (int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }

        System.out.println(s.size());

    }
}
