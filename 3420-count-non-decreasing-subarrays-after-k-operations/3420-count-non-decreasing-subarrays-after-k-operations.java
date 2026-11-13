class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        int right = n-1;
        Deque<int[]> deque = new ArrayDeque<>();
        long cost = 0;
        long answer = 0;
        for(int i=n-1; i>=0; i--){

            int count = 1;

            while(!deque.isEmpty() && deque.peekLast()[0]<nums[i]){
                int[] group = deque.pollLast();
                cost += (long) (nums[i] - group[0]) * group[1];
                count += group[1];

            }
            deque.addLast(new int[]{nums[i],count});

            while(cost>k){
                int[] group = deque.peekFirst();

                cost -= group[0] - nums[right];
                group[1]--;

                if(group[1]==0){
                    deque.pollFirst();
                }
                right--;
            }
            answer += right - i + 1;
        }
        return answer;
    }
}