class Solution {
    public int[] plusOne(int[] digits) {
      int size = digits.length - 1;
      int carry = 1;
      for(int i=digits.length-1; i>=0; i--){
          carry = digits[i] + carry;
          digits[i] = carry % 10;
          carry = carry / 10;
          if(carry <= 0){
              return digits;
          }
      }  
      int[] result = new int[size+2];
      result[0] = carry;
      for(int i=0; i<digits.length; i++){
          result[i+1] = digits[i];
      }
      return result;
    }
}