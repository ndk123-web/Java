// 3 1 3 4 3  and k=6 
// op is 1 (3,3)
import java.util.Arrays;

class Solution {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);  // 1 3 3 3 4
        int st=0;
        int end=nums.length-1;
        int c=0;

        while(st<end){
            int sum=nums[st]+nums[end];
            if(sum==k){
                c++;
                st++; end--;
            }
            else
                if(sum < k){
                    st++;
                }else{
                    end--;
                }
        }
        return c;
    }
}

public class Leet2{
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int k=5;
        Solution sol = new Solution();
        System.out.println(sol.maxOperations(arr, k));
    }
}