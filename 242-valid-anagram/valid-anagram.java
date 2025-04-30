class Solution {
    public boolean isAnagram(String s, String t) {
        int a_len = s.length();
        int t_len = t.length();
        if(a_len != t_len){
            return false;
        }
        int[] charFreq = new int[26];
        for(int i=0; i<a_len; i++){
            charFreq[s.charAt(i) - 'a']++;
            charFreq[t.charAt(i) - 'a']--;
        }

        for(int freq : charFreq){
            if(freq != 0){
                return false;
            }
        }
        return true;
    }
}