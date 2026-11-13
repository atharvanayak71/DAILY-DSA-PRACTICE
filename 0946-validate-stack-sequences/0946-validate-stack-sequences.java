class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int j = 0;
        
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<pushed.length; i++){

            stack.push(pushed[i]);
            
            while(!stack.isEmpty() && popped[j] == stack.peek()){
                stack.pop();
                j++;
            }
            
        }
        return j == popped.length;
    }
}