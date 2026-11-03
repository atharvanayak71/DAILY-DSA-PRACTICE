class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length; i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int j=0; j<nums2.length; j++){
            if(map.containsKey(nums2[j])){
                list.add(nums2[j]);
                map.remove(nums2[j]);
            }
        }
        int [] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}