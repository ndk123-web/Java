import java.util.*;

class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double maxavg=Double.NEGATIVE_INFINITY , curravg=0;

        for(int i=0;i<k;i++){
            curravg+=(double)nums[i];
        }
        maxavg=curravg;

        for(int i=k;i<nums.length;i++){
            curravg=curravg+nums[i]-nums[i-k];
            maxavg=Math.max(curravg,maxavg);
        }
    return maxavg / k ;
    }
}

public class Sliding_Approach{
    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3};
        Solution sol = new Solution();
        System.out.println(sol.findMaxAverage(nums, 4));
    }
}