class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> result = new ArrayList<>();
        for(int i=1; i<candies.length; i++){
            if( candies[i] > max ){
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length; i++){
            int total = extraCandies + candies[i];
            result.add( total >= max );
        }
        return result;

    }
}