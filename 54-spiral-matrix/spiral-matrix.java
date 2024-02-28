class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;
        while( true ){
            result.add(matrix[i][j]);
            matrix[i][j] = 101;
            if(( i == 0 || matrix[i-1][j] == 101) &&  ( j+1 <= cols && matrix[i][j + 1 ] != 101 )){
                j++;
            }else if(( j == cols  || matrix[i][j + 1 ] == 101) && ( i+1 <= rows && matrix[i+1][j] != 101 )){
                i++;
            }else if( (i == rows || matrix[i+1][j] == 101) && ( j-1 >= 0 && matrix[i][j-1] != 101 )){
                j--;
            }
            else if( (j==0 || matrix[i][j - 1 ] == 101) && ( i-1 >= 0 && matrix[i-1][j] != 101) ){
                i--;
            }else{
                break;
            }
        }
        return result;
    }
}