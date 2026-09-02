/**
 * 18. 4Sum
 * Difficulty: Medium | Tags: Array, Two Pointers, Sorting
 * https://leetcode.com/problems/4sum/
 *
 * Pattern: Two Pointers + Sorting (Fixed Pair)
 * Key insight: After sorting, fix two elements via nested loops and balance the remaining subarray with two pointers.
 * The sum is computed as a long, so intermediate overflow from adding up to four 32-bit integers is avoided before
 * comparison with the target.
 *
 * Time Complexity: O(N^3) - The two fixed-loop indices plus the two-pointer sweep give O(N^3); sorting is an O(N log N)
 * lower-order term.
 * Space Complexity: O(N) - A HashSet deduplicates quadruplets that is proportional to the number of solutions found.
 *
 * Edge Cases Handled: null or arrays with fewer than 4 elements (returns empty list); duplicate quadruplets removed via
 * HashSet; overflow guarded by computing the sum as a long.
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
