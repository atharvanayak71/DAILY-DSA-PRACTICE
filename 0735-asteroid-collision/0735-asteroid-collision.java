class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<asteroids.length; i++){
            boolean flag = true;
            while(!stack.isEmpty() && stack.peek()< Math.abs(asteroids[i]) && asteroids[i]<0 && stack.peek()>0){
                stack.pop();
            }
            if(!stack.isEmpty() && asteroids[i]<0 && stack.peek()>0){
                if(stack.peek() == Math.abs(asteroids[i])){
                    stack.pop();
                    flag = false;
                }else if(stack.peek()>Math.abs(asteroids[i])){
                    flag = false;
                }
            }
            if(flag){
            stack.push(asteroids[i]);
        }
        }
        while(!stack.isEmpty()){
            list.add(0,stack.pop());
        }
        int [] arr = new int[list.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);
        }
        return arr;
    }
}