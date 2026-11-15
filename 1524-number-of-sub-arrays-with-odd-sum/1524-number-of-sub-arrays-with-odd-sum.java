class Solution {
    public int numOfSubarrays(int[] nums) {
       HashMap<Integer, Integer> f = new HashMap<>();
       long MOD = 1_000_000_007;
       int k = 2;
       long sum = 0;
       long divisible = 0;
       f.put(0,1);
       for(int i = 0; i < nums.length; i++){
        sum += nums[i];
        int ques = (int) (sum % k);
            if (ques < 0) {
                ques += k;
            }
        long freq = f.getOrDefault(ques,0);
        divisible += freq;
        f.put(ques, f.getOrDefault(ques,0)+1);
       }
       long n = nums.length;

       long totalSubarrays = (n * (n + 1))/2;
       long answer = totalSubarrays - divisible;

       return (int)(answer % MOD);
    }
}