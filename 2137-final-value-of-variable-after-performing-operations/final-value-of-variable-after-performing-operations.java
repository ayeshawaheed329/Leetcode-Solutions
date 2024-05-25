class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String op : operations){
            char type = op.charAt(1);
            if( type == '+' ){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
}