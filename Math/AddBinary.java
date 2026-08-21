/**
 * 67. Add Binary
 * Difficulty: Easy | Tags: Math, String, Bit Manipulation, Simulation
 * https://leetcode.com/problems/add-binary/
 *
 * Pattern: Math
 * Key insight: Systematically processes the input relying on math principles.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - StringBuilder grows with the input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;
        while (i >= 0 || j >= 0 || c == 1) {
            int sum = c;
            if (i >= 0) {
                sum = sum + a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum = sum + b.charAt(j) - '0';
                j--;
            }
            res.append(sum % 2);
            c = sum / 2;

        }
        return res.reverse().toString();
    }
}
