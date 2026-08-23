/**
 * 1732. Find the Highest Altitude
 * Difficulty: Easy | Tags: Array, Prefix Sum
 * https://leetcode.com/problems/find-the-highest-altitude/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int[] presum = new int[gain.length + 1];

        for (int i = 0; i < gain.length; i++) {
            presum[i + 1] = presum[i] + gain[i];
        }
        int max = 0;
        for (int i = 0; i < gain.length + 1; i++) {
            if (max < presum[i]) {
                max = presum[i];
            }
        }
        return max;
    }
}
