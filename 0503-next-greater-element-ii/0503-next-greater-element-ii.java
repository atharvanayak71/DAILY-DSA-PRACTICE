class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] arr = new int[nums.length];
        int n = nums.length;
        for(int i=0; i<nums.length;i++){
            arr[i] = -1;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <= nums[i%n]){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    arr[i] = -1;
                }else{
                    arr[i] = stack.peek();
                }
            }
            stack.push(nums[i%n]);
        }
        return arr;
    }
}