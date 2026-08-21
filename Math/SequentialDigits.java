/**
 * 1291. Sequential Digits
 * Difficulty: Medium | Tags: Enumeration
 * https://leetcode.com/problems/sequential-digits/
 *
 * Pattern: Enumeration
 * Key insight: Systematically processes the input relying on enumeration principles.
 *
 * Time Complexity: O(1) - Bounded by a fixed pool of 9 digits and string lengths (~36 max iterations)
 * Space Complexity: O(1) - Auxiliary collection holds at most a constant ~36 valid numbers
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        String g = "123456789";
        String s = String.valueOf(low);
        String t = String.valueOf(high);
        List<Integer> res = new ArrayList<>();
        for (int i = s.length(); i <= t.length(); i++) {
            for (int j = 0; j < g.length() - i + 1; j++) {
                int temp = Integer.valueOf(g.substring(j, j + i));
                if (temp >= low && temp <= high) {
                    res.add(temp);
                }
                if (temp > high) {
                    return res;
                }
            }
        }
        return res;
    }
}
