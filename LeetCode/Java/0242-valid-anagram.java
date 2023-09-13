class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqTable = new int[26];
        
        for (char ch : s.toCharArray()) {
            freqTable[ch - 'a']++;
        }
        
        for (char ch : t.toCharArray()) {
            if (freqTable[ch - 'a'] == 0) {
               return false; 
            }
            freqTable[ch - 'a']--;
        }
        
        for (int freq : freqTable) {
            if (freq != 0) {
                return false;
            }
        }
        
        return true;
    }
}