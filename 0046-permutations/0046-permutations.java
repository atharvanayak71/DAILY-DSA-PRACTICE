class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        backtrack(used, temp, nums);
        return result;
    }
    public void backtrack(boolean [] used, ArrayList<Integer> temp, int [] nums){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<used.length; i++){
            if(used[i]) continue;

            temp.add(nums[i]);
            used[i] = true;
            backtrack(used,temp,nums);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
}
