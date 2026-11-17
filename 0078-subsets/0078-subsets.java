class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        ArrayList<Integer> temp = new ArrayList<>(); //Store Subset

            solve(nums, 0 , temp);

            return result;
        }

    List<List<Integer>> result = new ArrayList<>();

    public void solve(int[] nums, int i, ArrayList<Integer> temp){

        if(i>=nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        solve(nums,i+1,temp);
        temp.remove(temp.size()-1);
        solve(nums,i+1,temp);
    }
}