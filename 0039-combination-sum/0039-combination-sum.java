class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> temp = new ArrayList<>();

        solve(candidates, target, 0, temp);
        return result;
    }
    List<List<Integer>> result = new ArrayList<>();
    public void solve(int [] nums, int rem, int i, ArrayList<Integer> temp){
        
        if(rem == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(rem<0) return;

        if(i == nums.length) return;

        temp.add(nums[i]);
        solve(nums, rem - nums[i], i, temp);
        temp.remove(temp.size()-1);
        solve(nums, rem, i+1, temp);
    }
}