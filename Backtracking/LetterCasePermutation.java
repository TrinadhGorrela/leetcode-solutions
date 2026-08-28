/**
 * 784. Letter Case Permutation
 * Difficulty: Medium | Tags: String, Backtracking, Bit Manipulation
 * https://leetcode.com/problems/letter-case-permutation/
 *
 * Pattern: Backtracking (Binary Choice)
 * Key insight: At each letter position branch into lowercase and uppercase; digits are appended unchanged, producing all 2^L combinations.
 *
 * Time Complexity: O(2^N) or O(N!) - Explores combinatorial possibilities via
 * recursion
 * Space Complexity: O(2^L * L) - L is number of letters, stores all permutations
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        solve(s, res, new String(), 0);
        return res;
    }

    public static void solve(String s, List<String> res, String temp, int st) {
        if (st == s.length()) {
            res.add(temp);
            return;
        }

        if (Character.isLetter(s.charAt(st))) {
            solve(s, res, temp + Character.toLowerCase(s.charAt(st)), st + 1);
            solve(s, res, temp + Character.toUpperCase(s.charAt(st)), st + 1);
        } else {
            solve(s, res, temp + s.charAt(st), st + 1);
        }

    }
}
