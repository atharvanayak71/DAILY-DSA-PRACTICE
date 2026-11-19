class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int score1 = Math.abs(nums[n-1] - nums[2]);
        int score2 = Math.abs(nums[n-2] - nums[1]);
        int score3 = Math.abs(nums[n-3] - nums[0]);
        
        int Maximized_Min_Score = Math.min(score1, Math.min(score2, score3));
        return Maximized_Min_Score;
    }
}