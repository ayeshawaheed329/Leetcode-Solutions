class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_sum = 0;
        for( int[] arr: accounts ){
            int sum = 0;
            for(int n: arr){
                sum += n;
            }
            if( sum > max_sum ){
                max_sum = sum;
            }
        }
        return max_sum;
    }
}