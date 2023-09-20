class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int evenPtr = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[evenPtr];
                nums[evenPtr] = nums[i];
                nums[i] = temp;
                evenPtr++;
            }
        }
        return nums;
    }
}