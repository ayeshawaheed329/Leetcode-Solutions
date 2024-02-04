class Solution {
    public int missingNumber(int[] nums) {
        sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int n = arr[i];
            if(n<arr.length && n!=i){
                int temp = arr[n];
                arr[n] = arr[i];
                arr[i] = temp;
            }else{
                i+=1;
            }
        }
    }
}