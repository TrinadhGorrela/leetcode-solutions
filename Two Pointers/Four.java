/**
 * 18. 4Sum
 * Difficulty: Medium | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/4sum/
 *
 * Pattern: Sorting + Two Pointers (Nested Loop Fix Two, Sweep Two)
 * Key insight: After sorting, fix two elements with nested loops and use a two-pointer scan on the remaining range. The sum is accumulated into a long to prevent integer overflow when combining four values. A HashSet deduplicates quadruplets.
 *
 * Time Complexity: O(N^3) - Sorting is O(N log N), dominated by two nested loops each with an inner two-pointer scan
 * Space Complexity: O(N) - HashSet stores up to O(N) unique quadruplets; sorting may use O(log N) stack space
 *
 * * Edge Cases Handled: null or fewer than 4 elements returns empty list; integer overflow prevented by casting to long; duplicate quadruplets deduplicated via HashSet
 */
class Four {
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
