/**
 * 1291. Sequential Digits
 * Difficulty: Medium | Tags: Enumeration
 * https://leetcode.com/problems/sequential-digits/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
