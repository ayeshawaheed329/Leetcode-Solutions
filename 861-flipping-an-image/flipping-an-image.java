class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            int len = row.length;
            for(int i=0; i<(len+1)/2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[len-i-1] ^ 1;
                row[len-i-1] = temp;
            }
        }
        return image;
    }
}