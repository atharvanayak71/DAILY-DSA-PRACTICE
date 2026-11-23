class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<Integer> stack = new Stack<>();
        List<String> result = new ArrayList<>();
        int j=0;
        for(int i=1;i<=n;i++){
            if(j==target.length) break;
            if(i==target[j]){
                result.add("Push");
                j++;
            }else{
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }
}