import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        @SuppressWarnings("unchecked")
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<Integer>();
            }
            buckets[freq].add(key);
        }
        
        int[] res = new int[k];
        for (int i = 0, j = buckets.length - 1; i < k && j >= 0; j--) {
            if (buckets[j] != null) {
                for (int key : buckets[j]) {
                    res[i++] = key;
                    if (i == k) {
                        return res;
                    }
                }
            }
        }
        return res;
    }
}