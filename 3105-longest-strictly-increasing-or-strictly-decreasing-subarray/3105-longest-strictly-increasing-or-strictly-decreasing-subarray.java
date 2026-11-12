class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        //int start = 0;
        int currLength = 1;
        int maxLength = 1;
        int n = nums.length;

        //Strictly Increasing
        for(int end=1; end<n; end++){
            if(nums[end]>nums[end-1]){
                currLength++;
            }else{
                maxLength = Math.max(maxLength, currLength);
                //start = end;
                currLength = 1;
            }
        }
        maxLength = Math.max(currLength, maxLength);
        currLength = 1;
        //start = 0;

        
        //Strictly Decreasing;
        for(int end=1; end<n; end++){
            if(nums[end]<nums[end-1]){
                currLength++;
            }else{
                maxLength = Math.max(maxLength, currLength);
                //start = end;
                currLength = 1;
            }
        }
        maxLength = Math.max(currLength, maxLength);
        return maxLength;
    }
}