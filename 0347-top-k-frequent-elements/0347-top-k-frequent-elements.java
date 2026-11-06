class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> array = new ArrayList<>(map.keySet());
        array.sort((a,b) -> map.get(b) - map.get(a)); //sorting on the basis of frequency of keys in descending order that's why we subtract next elemnt from current because java compares if the sign is +ve so b comes before a or if it's negative than a comes before b
        
        int [] arr = new int[k];
        for(int i=0; i<k; i++){
           arr[i] = array.get(i);
        }
        return arr;
    }
}