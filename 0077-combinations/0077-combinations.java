class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
       ArrayList<Integer> temp = new ArrayList<>();

       backtrack(1,temp,n,k);
       return result;
    }
    public void backtrack(int start, ArrayList<Integer> temp, int n, int k){
        for(int i=start; i<=n; i++){
            temp.add(i);
            backtrack(i+1,temp,n,k);
            temp.remove(temp.size()-1);
        }

        if(temp.size()==k){
            result.add(new ArrayList<>(temp));
            return;
        }
    }
}