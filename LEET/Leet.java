    class Solution {
        public void moveZeroes(int[] nums) {
            
            int k=0,i=0,c=0;

            for(i=0;i<nums.length;i++){
                if(nums[i] !=0 ){
                    nums[k]=nums[i];
                    k++;
                }else{
                    c+=1;
                }
            }
            
            for(i=k;i<nums.length;i++){
                nums[i]=0;
            }

            for (i = 0; i < nums.length; i++)
                System.out.print(nums[i] + " ");
        }
    }

public class Leet {
    public static void main(String[] args) {
        int arr[] = {0,0,1,2,3};
        Solution sol = new Solution();
        sol.moveZeroes(arr);
    }
}