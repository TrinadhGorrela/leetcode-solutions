/**
 * 2540. Minimum Common Value
 * Difficulty: Easy | Tags: Array, Hash Table, Two Pointers, Binary Search
 * https://leetcode.com/problems/minimum-common-value/
 *
 * Pattern: Hash Set
 * Key insight: Insert all elements of the first array into a set, then scan the second array for the smallest value that is also present in the set.
 *
 * Time Complexity: O(N+M) - Builds HashSet from nums1, loops nums2
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: no common value (returns -1), duplicates within arrays (deduplicated), common value at position 0
 */
class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int j = 0; j < nums2.length; j++) {
            if (set.contains(nums2[j])) {
                res = Math.min(res, nums2[j]);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
