class Solution {
    public boolean isAnagram(String s, String t) {
        int a_len = s.length();
        int t_len = t.length();
        if(a_len != t_len){
            return false;
        }
        int[] charFreq = new int[26];
        for(char c: s.toCharArray()){
            charFreq[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            charFreq[c - 'a']--;
        }

        for(int freq : charFreq){
            if(freq != 0){
                return false;
            }
        }
        return true;
    }
}