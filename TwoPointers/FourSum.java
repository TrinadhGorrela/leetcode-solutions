/**
 * 18. 4Sum
 * Difficulty: Medium | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/4sum/
 *
 * Pattern: Sorting + Two Pointers (Nested Sum, Dedup via Set)
 * Key insight: Fix two indices, then run two pointers on the remainder; use a hash set of lists to deduplicate quadruplets and a long sum to avoid overflow.
 *
 * Time Complexity: O(N^3) - Two nested loops plus two-pointer search on remaining elements
 * Space Complexity: O(N^3) - Stores up to O(N^3) unique quadruplets in the worst case
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class FourSum {
   public static List<List<Integer>> fourSum(int[] nums, int target) {
		if (nums == null || nums.length < 4)
			return new ArrayList<>();

		Arrays.sort(nums);
		Set<List<Integer>> res = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				int left = j + 1;
				int right = nums.length - 1;

				while (left < right) {
					long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];

					if (sum == target) {
						res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						left++;
						right--;
					} else if (sum < target) {
						left++;
					} else
						right--;
				}
			}
		}

		return new ArrayList<>(res);
	}
}
