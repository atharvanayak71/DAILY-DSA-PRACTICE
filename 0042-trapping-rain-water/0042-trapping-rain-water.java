class Solution {
    public int trap(int[] heights) {
        int water = 0;
        int width = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<heights.length;i++){
            while(!stack.isEmpty() && heights[stack.peek()]<heights[i]){
                int bottom = heights[stack.pop()];
                if(stack.isEmpty()){
                    break;
                }else{
                    width = i - stack.peek() -1;
                }
                int bounded = Math.min(heights[stack.peek()], heights[i]) - bottom;
                water += bounded*width;
            }
            stack.push(i);
        }
        return water;
    }
}