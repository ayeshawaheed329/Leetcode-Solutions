class Solution {
    public int search(int[] nums, int target) {
        
        int index = getPeakIndex(nums);
        int start, end;
        if( nums[0] <= target && target <= nums[index]){
            start = 0;
            end = index;
        }else{
            start = index + 1;
            end = nums.length -1;
        }
        int ans = search(nums, target, start, end);
        return ans;
    }
    public int getPeakIndex(int[] nums) {
         int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public int search(int[] arr, int target, int start, int end ){

        while( start <= end){
            int middle = start + (end - start)/2;
            if( arr[middle] == target){
                return middle;
            }
            if( arr[middle] < target){
                start = middle + 1;
            }else{
                end = middle - 1;
            }

        }
        return -1;
    }
}