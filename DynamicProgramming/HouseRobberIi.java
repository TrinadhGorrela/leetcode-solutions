/**
 * 213. House Robber II
 * Difficulty: Medium | Tags: Array, Dynamic Programming
 * https://leetcode.com/problems/house-robber-ii/
 *
 * Pattern: Dynamic Programming (Circular Reduction)
 * Key insight: Because houses are circular (first and last are adjacent), run the linear House Robber DP on two sub-arrays: one excluding the first house and one excluding the last, taking the better result.
 *
 * Time Complexity: O(N) - Iterates over the input elements linearly
 * Space Complexity: O(N) - Uses arrays for skipFirst/skipLast processing
 *
 * Edge Cases Handled: empty array (returns 0), single house (returns its value), two houses (max of the two), circular adjacency handled by skipping first/last
 */
class HouseRobberIi {
    public int rob(int[] nums) {
        if (nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int[] skipLast = new int[nums.length - 1];
        int[] skipFirst = new int[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {
            skipLast[i] = nums[i];
            skipFirst[i] = nums[i + 1];
        }

        int lootSkippingLast = robbery(skipLast);
        int lootSkippingFirst = robbery(skipFirst);

        return Math.max(lootSkippingLast, lootSkippingFirst);
    }

    public static int robbery(int[] arr) {
        int[] loot = new int[arr.length];

        loot[0] = arr[0];
        loot[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            loot[i] = Math.max(loot[i - 2] + arr[i], loot[i - 1]);
        }
        return loot[arr.length - 1];
    }
}
