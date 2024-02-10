class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while( i < nums.length ){
            int n = nums[i];
            int correct = nums[n-1];
            if( n != i+1 ){
                if( n == correct ){
                    return n;
                }
                nums[i] = correct;
                nums[n-1] = n;
            }else{
                i++;
            }
        }
        return -1;
    }
}