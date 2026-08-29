/**
 * 1732. Find the Highest Altitude
 * Difficulty: Easy | Tags: Array, Prefix Sum
 * https://leetcode.com/problems/find-the-highest-altitude/
 *
 * Pattern: Prefix Sum
 * Key insight: Compute the running altitude (starting at 0) by cumulative gain, and track the maximum altitude reached.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses a presum array
 *
 * Edge Cases Handled: all negative gains (max stays 0), single element, longest altitude at start (index 0)
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
