class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dict = new HashSet<>();

        for(int num: nums){
            if(dict.contains(num)){
                return true;
            }
            dict.add(num);
        }
        return false;
    }
}