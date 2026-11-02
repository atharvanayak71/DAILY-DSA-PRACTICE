class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] matrix = new int[m][n];
        int k = 0;
        if(original.length != m*n){
            return new int[0][0];
        }
        for(int i=0; i<matrix.length;i++){ 
            for(int j=0; j<matrix[0].length;j++){
                matrix[i][j] = original[k];
                k++;
        }
    }
    return matrix;
    }
}