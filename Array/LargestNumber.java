/**
 * 179. Largest Number
 * Difficulty: Medium | Tags: Array, String, Greedy, Sorting
 * https://leetcode.com/problems/largest-number/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(N) - Uses a string array
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class LargestNumber {
    public String largestNumber(int[] nums) {
        String[] t = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            t[i] = nums[i] + "";
        }
        Arrays.sort(t, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder s = new StringBuilder();

        if (t[0].equals("0")) {
            return "0";
        }
        for (int i = 0; i < t.length; i++) {
            s.append(t[i] + "");
        }
        return s.toString();
    }
}
