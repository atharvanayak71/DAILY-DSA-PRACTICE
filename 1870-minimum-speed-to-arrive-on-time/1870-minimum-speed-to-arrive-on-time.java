class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int low = 1;
        int high = 10_000_000;

        for(int i : dist){
            high = Math.max(high,i);
        }
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(speed(dist, hour, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

private boolean speed(int[] dist, double hour, int maxSpeed){
        double timeTaken = 0;
        for(int time = 0; time<dist.length; time++){
            if(time<dist.length-1){
            timeTaken += (dist[time] + maxSpeed - 1)/maxSpeed;
            } else{
                timeTaken += (double) dist[time] / maxSpeed;
            }
        }
        return timeTaken<=hour; 
    }
}
