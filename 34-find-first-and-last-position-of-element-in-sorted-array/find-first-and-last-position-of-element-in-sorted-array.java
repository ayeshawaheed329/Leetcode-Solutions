class Solution {
    public int[] searchRange(int[] nums, int target) {

        int target_index = search(nums, target);
        if(target_index == -1){
            return  new int[]{-1, -1};
        }
        int i = target_index;
        int j = target_index;
        while(i>=0 && nums[i] == target){
            i--;
        };
        while(j<nums.length && nums[j] == target){
            j++;
        };
        return new int[]{i+1, j-1};
        
    }
    int search(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int middle = start + (end - start)/2;
            if( arr[middle] == target ){
                return middle;
            }
           if( arr[middle] < target){
                start = middle + 1;
            }else{
                end = middle - 1;
            }
        };
        return -1;
    }
}