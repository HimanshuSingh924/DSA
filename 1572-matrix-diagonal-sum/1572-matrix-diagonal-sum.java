class Solution {
    // HimanshuSingh924
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        // for(int i = 0; i < mat.length; i++){
        //     for(int j = 0; j < mat.length; j++){
        //         if(i == j || i+j == mat.length-1){
        //             sum += mat[i][j];
        //         }
        //     }
        // }

        int start = 0, end = mat.length - 1;
        for(int dia[] : mat){
            if(start != end){
                sum += dia[start];
                sum += dia[end];
            }
            start++;
            end--;
        }
        if(mat.length % 2 == 1){
            sum += mat[mat.length/2][mat.length/2];
        }
        return sum;
    }
}