class Solution {
    public int minChanges(String s) {
        int [] nums = new int[s.length()];
        int count = 0;
        for(int i=0; i<nums.length;i++){
            nums[i] = s.charAt(i) - '0';
        }
        for(int i=0; i<nums.length; i+=2){
            
            for(int j=i+1; j<i+2 && j<s.length(); j++){
                if(nums[j]<nums[j-1]){
                nums[j] = 1;
                count++;
            }if(nums[j]>nums[j-1]){
                nums[j] = 0;
                count++;
            }else{
                continue;
            }
            }

        }
        return count;
    }
}