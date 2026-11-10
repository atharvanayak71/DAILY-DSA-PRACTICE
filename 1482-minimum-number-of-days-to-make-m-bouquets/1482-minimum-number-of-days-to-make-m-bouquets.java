class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m * k > bloomDay.length) return - 1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int i: bloomDay){
            high = Math.max(high,i);
            low = Math.min(low,i);
        }
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(bouqet(bloomDay, m, k, mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    private boolean bouqet(int[] bloomday, int m, int k, int minDay){
        int flowerCount = 0;
        int gulDASTA = 0;
        for(int bloom : bloomday){
            if(bloom<=minDay){
                flowerCount++;
            if(flowerCount == k){
                gulDASTA++;
                flowerCount = 0;
            }
        }else{
            flowerCount = 0;
        }
        }
        return gulDASTA >= m;
    }
}