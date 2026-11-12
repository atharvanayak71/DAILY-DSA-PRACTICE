class Solution {
    public int splitArray(int[] arr, int k) {
       if(k>arr.length) return -1;
       
       long high = 0;
       long low = 0;
       for(long num : arr){
           low = Math.max(num, low);
           high += num;
       }
     
       long ans = high;
       while(low<=high){
           long mid = low + (high-low)/2;
           if(part(arr,k,mid)){
               ans = mid;
               high = mid - 1;
           }else{
               low = mid + 1; 
           }
       }
       return (int) ans;
    }
    private static boolean part(int[] arr, int k, long pages){
        int group = 1;
        int sum = 0;
        for(int page : arr){
            if(sum + page <= pages){
                sum += page;
            }
            else{
                group++;
                sum = page;
            }
        }
        return group <= k;
    }
}
