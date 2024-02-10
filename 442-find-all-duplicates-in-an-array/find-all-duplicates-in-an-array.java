class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        sort(nums);
        for(int i=0; i<nums.length; i++){
            if( nums[i] != i+1 ){
                duplicates.add(nums[i]);
            }
        }
        return duplicates;
    }
    void sort(int[] nums){
        int i = 0;
        while( i< nums.length ){
            int n = nums[i];
            int correct = nums[n-1];
            if( n != i+1 && correct != n ){
                nums[i] = correct;
                nums[n-1] = n;
            }else{
                i++;
            }
        }
    }
    
}