class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        int hi = matrix.length - 1;
            
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            for (int i = 0; i < matrix[mid].length; i++) {
                if (matrix[mid][i] == target) {
                    return true;
                }
                else if (matrix[mid][0] < target) {
                    lo = mid + 1;
                }
                else {
                    hi = mid - 1;
                }
            }
        }
        return false;
    }
}