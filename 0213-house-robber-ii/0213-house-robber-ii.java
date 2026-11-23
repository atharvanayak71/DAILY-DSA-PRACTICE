import java.util.*;
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        int [] memo1 = new int[n];
        int [] memo2 = new int[n];

        Arrays.fill(memo1,-1);
        Arrays.fill(memo2,-1);

        int case1 = dp(nums, 0, n-2,memo1);
        int case2 = dp(nums, 1, n-1, memo2);
        return Math.max(case1,case2);
    }
    public int dp(int [] nums, int i, int end, int [] t){

        if(i>end){
            return 0;
        }
        
        if(t[i]!= -1){
            return t[i];
        }
      

        int steal = nums[i] + dp(nums, i+2, end, t);
        int skip = dp(nums, i+1, end, t);

        return t[i] = Math.max(steal,skip);
    }
}