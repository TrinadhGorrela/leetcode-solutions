/**
 * 3731. Find Missing Elements
 * Difficulty: Easy | Tags: Array, Hash Table, Sorting
 * https://leetcode.com/problems/find-missing-elements/
 *
 * Pattern: Sorting
 * Key insight: Sorts the array to sequentially identify missing elements.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: duplicates (skipped), single element (none missing), contiguous range with no gaps, gaps at either end
 */
class FindMissingElements {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int in = 0;
        int low = nums[0];
        int high = nums[nums.length - 1];

        while (in < nums.length) {
            if (nums[in] == low) {
                low++;
                in++;
            } else if (nums[in] < low) {
                in++;
            } else {
                list.add(low);
                low++;
            }
        }
        return list;
    }
}
