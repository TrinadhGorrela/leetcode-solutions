/**
 * 3731. Find Missing Elements
 * Difficulty: Easy | Tags: Array, Hash Table, Sorting
 * https://leetcode.com/problems/find-missing-elements/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
            } else {
                list.add(low);
                low++;
            }
        }
        return list;
    }
}
