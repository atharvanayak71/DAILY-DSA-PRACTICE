class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        int n = nums.size();
        int length = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += nums.get(j);
                length = j-i+1;

                if(length>=l && length<=r){
                    if(sum>0){
                        minSum = Math.min(minSum,sum);
                    }
                }
            }
        }
        if(minSum == Integer.MAX_VALUE){
            return -1;
        }
        return minSum;
    }
}