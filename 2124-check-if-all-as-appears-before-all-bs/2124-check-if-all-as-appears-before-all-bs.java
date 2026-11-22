class Solution {
    public boolean checkString(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            while(!stack.isEmpty() && stack.peek() == 'b' && ch == 'a'){
                return false;
            }
            stack.push(ch);
        }
        return true;
    }
}