class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            List<String> list = new ArrayList<>();
            if (map.containsKey(sorted)) {
                list = map.get(sorted);
            }else{
                list = new ArrayList<>();
            }
            list.add(str);
            map.put(sorted, list);
        }
      

        return  new ArrayList<>(map.values());
    }

}