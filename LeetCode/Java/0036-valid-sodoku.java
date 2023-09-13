import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        @SuppressWarnings("unchecked")
        HashSet<Character>[] rowCheck = new HashSet[9];

        @SuppressWarnings("unchecked")
        HashSet<Character>[] colCheck = new HashSet[9];
        
        @SuppressWarnings("unchecked")
        HashSet<Character>[] boxCheck = new HashSet[9];
        
        for (int i = 0; i < 9; i++) {
            rowCheck[i] = new HashSet<>();
            colCheck[i] = new HashSet<>();
            boxCheck[i] = new HashSet<>();
        }
        
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                char curr = board[row][col];
                
                if (curr == '.') {
                    continue;
                }
                
                if (rowCheck[row].contains(curr)) {
                    return false;
                }
                rowCheck[row].add(curr);
                
                if (colCheck[col].contains(curr)) {
                    return false;
                }
                colCheck[col].add(curr);
                
                int box = 3 * (row / 3) + (col / 3);
                if (boxCheck[box].contains(curr)) {
                    return false;
                }
                boxCheck[box].add(curr);
            }
        }
        return true;
    }
}