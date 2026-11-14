import java.util.Stack;

class Solution {

    public int calculate(String s) {

        char [] ch = s.toCharArray();
        int result = 0;
        int num = 0;
        int sign = 1;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<ch.length; i++){

            char c = s.charAt(i);

            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            }
            else if(c == '+'){
                result += (num*sign);
                num = 0;
                sign = 1;
            }
            else if(c == '-'){
                result += (num*sign);
                num = 0;
                sign = -1;
            }
            else if(c == '('){
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            }
            else if(c == ')'){
                result += (num*sign);
                num = 0;

                int prevSign = stack.pop();
                int prevResult = stack.pop();

                result *= prevSign;
                result += prevResult;
            }
        }
        result += (num*sign);
        
        return result;
    }
}