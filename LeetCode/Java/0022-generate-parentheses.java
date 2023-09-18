import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }
    
    private void backtrack(List<String> list, String currentString, int open, int close, int max) {
        if (currentString.length() == max * 2) {
            list.add(currentString);
        }
        if (open < max) {
            backtrack(list, currentString + "(", open + 1, close, max);
        }
        if (close < open) {
            backtrack(list, currentString + ")", open, close + 1, max);
        }
    }
}