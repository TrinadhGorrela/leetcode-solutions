/**
 * 1446. Consecutive Characters
 * Difficulty: Easy | Tags: String
 * https://leetcode.com/problems/consecutive-characters/
 *
 * Pattern: Sliding Window
 * Key insight: Iterate through the string, maintaining a count of consecutive identical characters and updating the maximum count when the sequence breaks or at the end.
 *
 * Time Complexity: O(N) - Single pass through string
 * Space Complexity: O(1) - Constant extra variables
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class ConsecutiveCharacters {
    public int maxPower(String s) {
        int left = 0;
        int count = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(left) == s.charAt(right)) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
                left = right;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}
