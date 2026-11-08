class Solution {
    public int findNonMinOrMax(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        if(nums.length<=2){
            return -1;
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]<min)  min = nums[i];
            if(nums[i]>max)  max = nums[i];
            
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i] != max && nums[i] != min){
                return nums[i];
            }
        }
        return -1;
    }
}