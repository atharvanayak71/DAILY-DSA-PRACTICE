class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int darinda = 0;
        
        Stack<Integer> phimosis = new Stack<>();

        for(int i=0; i<pushed.length; i++){

            phimosis.push(pushed[i]);
            
            while(!phimosis.isEmpty() && popped[darinda] == phimosis.peek()){
                phimosis.pop();
                darinda++;
            }
            
        }
        return darinda == popped.length;
    }
}