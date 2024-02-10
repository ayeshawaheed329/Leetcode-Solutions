class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while( start < end ){
            int middle = start + ( end - start )/2;
            if( nums[middle] == target ){
                return middle;
            }
            if( nums[middle] > target ){
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        }
        if(nums[start]<target){
            return start+1;
        }else{
            return start;
        }
    }
}