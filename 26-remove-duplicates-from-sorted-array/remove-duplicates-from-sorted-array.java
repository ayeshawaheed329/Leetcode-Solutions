class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> unique = new ArrayList<>();
        
        int prev = nums[0];
        unique.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if( nums[i] != prev ){
                unique.add(nums[i]);
            }
            prev = nums[i];
        }
        int size = unique.size();
        for(int i=0; i<size; i++){
            nums[i] = unique.get(i);
        }
        return size;
    }
}