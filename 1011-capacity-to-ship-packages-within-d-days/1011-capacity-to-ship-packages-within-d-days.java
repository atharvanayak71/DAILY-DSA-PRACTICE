class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int i : weights){
            low = Math.max(low, i);
            high += i; 
        }
        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canShip(weights, days, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canShip(int [] weights,int days,int  maxCapacity){ 
        int daysUsed = 1;
        int currWeight = 0;
        for(int weight: weights){
            if(currWeight + weight > maxCapacity){
                daysUsed++;
                currWeight = weight;
            }else{
                currWeight += weight;
            }
        }
        return daysUsed<= days;
    }
}