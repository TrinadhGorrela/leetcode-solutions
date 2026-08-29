/**
 * 15. 3Sum
 * Difficulty: Medium | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/3sum/
 *
 * Pattern: Sorting + Two Pointers (Nested Sum, Dedup via Set)
 * Key insight: Sort, fix one element, then two-pointer the remainder toward sum zero; a hash set of lists deduplicates the triplets.
 *
 * Time Complexity: O(N^2) - The outer loop combined with the inner two-pointer scan dominates the O(N log N) sort
 * Space Complexity: O(N^2) - Stores up to O(N^2) unique triplets in the worst case
 *
 * Edge Cases Handled: null or empty array, fewer than 3 elements, no valid triplets (returns empty list), duplicates deduplicated via set
 */
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
