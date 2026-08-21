/**
 * 20. Valid Parentheses
 * Difficulty: Easy | Tags: String, Stack, Bracket Sequences
 * https://leetcode.com/problems/valid-parentheses/
 *
 * Pattern: String
 * Key insight: Systematically processes the input relying on string principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        char c;
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                 res.push(c);
            }
            else{
                if(res.isEmpty()){
                    return false;
                }
                char top = res.pop();
        if ((c == ')' && top != '(') ||
            (c == ']' && top != '[') ||
            (c == '}' && top != '{')) {
            return false;
            }
        }
     
    }
    return res.isEmpty();
    }
}
