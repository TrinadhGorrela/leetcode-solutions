/**
 * 179. Largest Number
 * Difficulty: Medium | Tags: Array, String, Greedy, Sorting
 * https://leetcode.com/problems/largest-number/
 *
 * Pattern: Sorting (Custom Comparator)
 * Key insight: Convert numbers to strings and sort by the concatenation comparator (b+a).compareTo(a+b) so the largest combined number comes first; guard against the all-zeros case.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(N) - Uses a string array
 *
 * Edge Cases Handled: all zeros (returns "0" not "000..."), single element, numbers with common prefixes, leading-zero formatting avoided
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
