class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        
        for(int kela : piles){
            high = Math.max(high, kela);
            low = Math.min(low, kela);
        }
        int ans = high;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(KHA_LEGI(piles, h, mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
        
        private boolean KHA_LEGI(int[] piles, int h, int k){
            long hours = 0;
            for(int kela : piles){
                hours += (kela + k - 1)/k;
            }
        return hours <= h;
    }
}