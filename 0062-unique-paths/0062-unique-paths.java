class Solution {
    public int uniquePaths(int m, int n) {
        int[][] d = new int[m][n];

        for(int col = 0; col < m; col++){
            for(int row = 0; row < n; row++){
                d[col][row] = 1;
            }
        }

        for(int col = 1; col < m; col++){
            for(int row = 1; row < n; row++){
                d[col][row] = d[col-1][row] + d[col][row-1];
            }
        }

        return d[m-1][n-1];
    }
}