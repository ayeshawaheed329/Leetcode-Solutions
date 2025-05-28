class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] prefix = new int[len];
        int[] postfix = new int[len];
        int[] result = new int[len];
        for(int i=0; i<len; i++){
          int pref = 1;
          if(i!=0){
            pref = prefix[i-1] * nums[i-1];
          }
          prefix[i] = pref;
        }
         for(int i=len-1; i>=0; i--){
          int postf = 1;
          if(i!=len-1){
            postf = postfix[i+1] * nums[i+1];
          }
          postfix[i] = postf;
        }
        for(int i=0; i<len; i++){
            result[i] = prefix[i] * postfix[i];
        }
        return result;

    }
}