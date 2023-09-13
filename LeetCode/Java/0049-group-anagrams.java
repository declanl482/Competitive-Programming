import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagramMap = new HashMap<>();
        
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String strKey = String.valueOf(chars);
            
            if (!anagramMap.containsKey(strKey)) {
                anagramMap.put(strKey, new ArrayList<String>());
            }
            
            anagramMap.get(strKey).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}