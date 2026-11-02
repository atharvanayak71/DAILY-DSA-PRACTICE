class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<int[]> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(stack.isEmpty() || stack.peek()[0]!= ch){
                stack.push(new int[]{ch,1});
            }else{
                stack.peek()[1]++;
            }
            if(!stack.isEmpty() && stack.peek()[1] == k){
                stack.pop();
            }
        }
        while(!stack.isEmpty()){
            int [] top = stack.pop();
            for(int j=0; j<top[1]; j++){
                res.append((char)top[0]);
            }
        }
        return res.reverse().toString();
    }
}