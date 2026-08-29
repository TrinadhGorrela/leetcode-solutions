/**
 * 22. Generate Parentheses
 * Difficulty: Medium | Tags: String, Dynamic Programming, Backtracking, Bracket
 * Sequences
 * https://leetcode.com/problems/generate-parentheses/
 *
 * Pattern: Backtracking (Valid Bracket Construction)
 * Key insight: Recursively place '(' whenever any remain, and ')' only when more close than open brackets are pending, ensuring every generated string is well-formed.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via
 * recursion
 * Space Complexity: O(Catalan(n) * n) - Stores all valid parenthesis strings
 *
 * Edge Cases Handled: n = 1 (single "()"), only well-formed strings (close never exceeds open guard)
 */
class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve(n, n, new String(), res);
        return res;
    }

    public static void solve(int open, int close, String s, List<String> res) {
        if (open == 0 && close == 0) {
            res.add(s);
            return;
        }

        if (open > 0) {
            solve(open - 1, close, s + '(', res);
        }

        if (close > open) {
            solve(open, close - 1, s + ')', res);
        }
    }
}
