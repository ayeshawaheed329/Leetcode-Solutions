class Solution {
    public int removeDuplicates(int[] nums) {
        int first = 0;
        int last = 1;
        while( last < nums.length ){
            if( nums[first] >= nums[last] ){
                while( last < nums.length && nums[first] >= nums[last]){
                    last++;
                }
            }
            if( last <  nums.length ){
                nums[first + 1] = nums[last];
                first++;
                last++;
            }
        }
        return first+1;
    }
}