class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for( int i=0; i<nums.length; i++ ){

            int required = target  - nums[i];
            Integer  sol = map.get(required);
            if(sol != null){
                return new int[]{i, sol};
            }else{
                map.put(nums[i], i);
            }
            
        }
        return new int[]{-1,-1};
    }
}