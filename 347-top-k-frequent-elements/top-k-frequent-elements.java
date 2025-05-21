import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(k == nums.length){
            return nums;
        }

        // count
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            int freq = map.getOrDefault(n,0);
            freq += 1;
            map.put(n, freq);
        }

        // priority queue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b)- map.get(a));
        for(Integer n: map.keySet()){
            maxHeap.add(n);
        }
        
        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = maxHeap.poll(); 
        }

       return result;
    }
}