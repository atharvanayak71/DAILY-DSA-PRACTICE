class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : position){

            min = Math.min(min, i);
            max = Math.max(max, i);

        }

        int high = max - min;

        int ans = -1;

        while(low<=high){

            int mid = low + (high - low)/2;

            if(dist(position,m,mid)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            } 
        }
        return ans;
    }
    
    private boolean dist(int[] position, int m, int minDist){
        int last = position[0];
        int ball = 1;
        for(int current=1; current<position.length; current++){
            if((position[current] - last)>=minDist){
                last = position[current];
                ball++;
            }
        }
        return ball>=m;
    }
}