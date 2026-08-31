/**
 * 20. Valid Parentheses
 * Difficulty: Easy | Tags: String, Stack, Bracket Sequences
 * https://leetcode.com/problems/valid-parentheses/
 *
 * Pattern: Stack-Based Bracket Matching
 * Key insight: Push every opening bracket; on a closing bracket, check the stack top for the matching type and pop. The
 * string is valid iff the stack is empty at the end.
 *
 * Time Complexity: O(n) - Each character pushed and popped at most once.
 * Space Complexity: O(n) - Worst case: all opening brackets pushed.
 *
 * Edge Cases Handled: empty string (valid), single bracket (unmatched), closing bracket with empty stack, mismatched
 * pair types, deeply nested valid sequence
 */
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
