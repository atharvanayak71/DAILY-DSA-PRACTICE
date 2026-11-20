class Solution {
    public int[] finalPrices(int[] prices) { 
        /*


                    BRUTE FORCE

        for(int i = 0; i<prices.length; i++){
            for(int j = i+1; j<prices.length; j++){
                if(prices[j]<=prices[i]){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;

        */
        Stack<Integer> stack = new Stack<>();
        
        for(int i=prices.length-1; i>=0; i--){
            int original = prices[i];
            while(!stack.isEmpty() && stack.peek() > original){
                stack.pop();
            }
            if(!stack.isEmpty()){
                prices[i] -= stack.peek();
            }
            stack.push(original);
        }
        return prices;
    }
}