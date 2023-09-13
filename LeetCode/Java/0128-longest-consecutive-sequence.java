import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        HashSet<Integer> hset = new HashSet<>();
        for (int num : nums) {
            hset.add(num);
        }
        
        for (int num : hset) {
            if (!hset.contains(num - 1)) {
                int length = 0;
                while (hset.contains(num + length)) {
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        
        return maxLength;
    }
}
