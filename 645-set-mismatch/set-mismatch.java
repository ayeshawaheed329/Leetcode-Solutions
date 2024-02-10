class Solution {
    public int[] findErrorNums(int[] nums) {
        sort(nums);
        for(int i=0; i<nums.length; i++){
            if( nums[i] != i+1 ){
                return new int[] {nums[i], i+1};
            }
        }

        return new int[] {-1,-1};
    }
    public void sort(int[] nums){
        int i = 0;
        while( i < nums.length ){
            int n = nums[i];
            int correct = nums[n-1];
            if( n != i+1 && n != correct ){
                nums[i] = correct;
                nums[n-1] = n;
            }else{
                i++;
            }
        }
    }
}