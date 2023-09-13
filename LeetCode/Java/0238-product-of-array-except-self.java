class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int[] res = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix = prefix * nums[i];
        }
        
        for (int j = nums.length - 1; j >= 0; j--) {
            res[j] = res[j] * suffix;
            suffix = suffix * nums[j];
        }
        
        return res;
    }
}