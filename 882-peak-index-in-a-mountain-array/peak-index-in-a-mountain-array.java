class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int peak = arr[0];
        int peakIndex = - 1;
        while(start <= end){
            int middle = start + ( ( end - start ) / 2 );
            if(arr[middle] > arr[middle + 1]){
                if(arr[middle] > peak){
                    peak = arr[middle];
                    peakIndex = middle;
                }
                end = middle - 1;
            }else{
                start = middle + 1;
            }
        }
        return peakIndex;
    }
}