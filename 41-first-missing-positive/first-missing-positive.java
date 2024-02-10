class Solution {
    public int firstMissingPositive(int[] nums) {
     sort(nums);
     for(int i=0; i<nums.length; i++){
        if( nums[i] != i + 1 ){
            return i+1;
        }
     }
     return nums[nums.length - 1] + 1;    
    }
    public void sort(int[] nums){
        int i = 0;
        while( i < nums.length ){
            int n = nums[i];
            if( n != i+1 && n < nums.length && n>0 && n != nums[n-1]){
                int correct = nums[n-1];
                nums[i] = correct;
                nums[n-1] = n;
            }else{
                i++;
            }
        }
    }
}