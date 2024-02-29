class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count = 1;
        int i = 0;
        int j = 0;
        int rows = n - 1;
        int cols = n - 1;
        while( count <= n*n ){
            matrix[i][j] = count;
            count++;
            if(( i == 0 || matrix[i-1][j] != 0 ) &&  ( j+1 <= cols && matrix[i][j + 1 ] == 0 )){
                j++;
            }else if(( j == cols  || matrix[i][j + 1 ] != 0) && ( i+1 <= rows && matrix[i+1][j] == 0 )){
                i++;
            }else if( (i == rows || matrix[i+1][j] != 0) && ( j-1 >= 0 && matrix[i][j-1] == 0 )){
                j--;
            }else{
                i--;
            }
        }
        return matrix;
    }
}