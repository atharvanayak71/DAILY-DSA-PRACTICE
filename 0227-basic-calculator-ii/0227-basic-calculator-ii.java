import java.util.Stack;
class Solution {
    public int calculate(String s) {
    
        char [] ch = s.toCharArray();
        
        int num = 0;
        char po = '+';

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<ch.length; i++){

            char c = ch[i];

            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }
            if( (!Character.isDigit(c) && c != ' ') || i == ch.length - 1){

                if(po == '+'){
                    stack.push(num);
                }
                else if(po == '-'){
                    stack.push(-num);
                }
                else if(po == '*'){
                    int pn = stack.pop();
                    stack.push(pn * num);
                }
                else if(po == '/'){
                    int pn = stack.pop();
                    stack.push(pn / num);
                }

                po = c;
                num = 0;
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}