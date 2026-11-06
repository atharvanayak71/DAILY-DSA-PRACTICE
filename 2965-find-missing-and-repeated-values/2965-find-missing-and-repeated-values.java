class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int [] arr = new int[grid.length * grid[0].length];
        int x = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                map.put(grid[i][j], map.getOrDefault(grid[i][j],0)+1);
                arr[x] = grid[i][j];
                x++;
            }
        }
        for(int i=1; i<=arr.length; i++){
            if(map.containsKey(i) && map.get(i)>1){
                list.add(i);
            }
        }
        for(int i=1; i<=arr.length; i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        return new int[]{list.get(0), list.get(1)};
    }
}