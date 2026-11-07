class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] merge = new int[nums1.length + nums2.length];
        for(int i=0; i<merge.length; i++){
            if(i<nums1.length){
                merge[i] = nums1[i];
            } else{
                merge[i] = nums2[i - nums1.length];
            } 
        }
        
        Arrays.sort(merge);
        int n = merge.length;

        if(n % 2 != 0){
            return merge[n/2];
        }
        else{
            return (merge[n/2 - 1] + merge[n/2]) /2.0;
        }
    }
}