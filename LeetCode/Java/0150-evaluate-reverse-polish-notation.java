import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int op1, op2, res;
        
        for (String str : tokens) {
            if (str.equals("+")) {
                op2 = stack.pop();
                op1 = stack.pop();
                res = op1 + op2;
                stack.push(res);
            }
            else if (str.equals("-")) {
                op2 = stack.pop();
                op1 = stack.pop();
                res = op1 - op2;
                stack.push(res);
            }
            else if (str.equals("*")) {
                op2 = stack.pop();
                op1 = stack.pop();
                res = op1 * op2;
                stack.push(res);
            }
            else if (str.equals("/")) {
                op2 = stack.pop();
                op1 = stack.pop();
                res = op1 / op2;
                stack.push(res);
            }
            else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}