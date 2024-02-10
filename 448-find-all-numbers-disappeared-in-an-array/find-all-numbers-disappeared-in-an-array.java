class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

       ArrayList<Integer> result = new ArrayList<>();
        sort(nums);
        for(int i=0; i<nums.length; i++ ){
            if( nums[i] != i+1 && i < nums.length ){
                result.add(i+1);
            }
        }
        return result;
    }
    public void sort(int[] nums){
        int i = 0;
        while( i < nums.length ){
            int n = nums[i];
            int correct = nums[n-1];
            if( n != i+1 && n-1 < nums.length && n != correct ){
                nums[i] = correct;
                nums[n-1] = n;
            }else{
                i++;
            }
        }
    }
}