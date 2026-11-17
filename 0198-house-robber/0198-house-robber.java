import java.util.*;

class Solution {
    public int solve(int[] nums, int i, int n, int [] t){
        
        if(i>=nums.length){
            return 0;
        }
        if(t[i] != -1){
            return t[i];
        }
        int steal = nums[i] + solve(nums, i+2, n, t);
        int skip = solve(nums, i+1, n, t);

        return t[i] = Math.max(steal, skip);
    }
    public int rob(int[] nums) {

        int [] t = new int[101];
        
        Arrays.fill(t,-1);

        int n = nums.length;
        return solve(nums, 0, n, t);   
    }
}