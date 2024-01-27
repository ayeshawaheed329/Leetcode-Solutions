/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int largest = getPeak(mountainArr) ;
        int ans = search(mountainArr, target, 0, largest);
        if( ans > -1){
            return ans;
        }else{
            return search(mountainArr, target, largest + 1, mountainArr.length() - 1);
        }
    }
    public int getPeak(MountainArray mountainArr){
        int start = 0;
        int end = mountainArr.length() - 1;
        while( start < end){
            int middle = start + ( end - start ) / 2;
            if( mountainArr.get(middle) > mountainArr.get(middle+1) ){
                end = middle;
            }else{
                start = middle + 1;
            }
        };
        return start;
    }

    public int search(MountainArray mountainArr, int target, int start, int end){
        boolean asc = mountainArr.get(start) < mountainArr.get(end);
        while( start <= end ){
            int middle = start + ( end - start ) / 2;
            if(mountainArr.get(middle) == target){
                return middle;
            }
             if(asc){
                if( mountainArr.get(middle) < target){
                    start = middle + 1;
                }else{
                    end = middle - 1;
                }
            }else{
                if( mountainArr.get(middle) > target){
                    start = middle + 1;
                }else{
                    end = middle - 1;
                }
            }
        };

        return -1;
    }
}