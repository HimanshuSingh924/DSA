class Solution {
    // HimanshuSingh924
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] trans = 
                new int[cols][rows];
    
        for(int  i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                trans[j][i] = matrix[i][j];
            }
        }

        return trans;
    }
}