/**
 * 2149. Rearrange Array Elements by Sign
 * Difficulty: Medium | Tags: Array, Two Pointers, Simulation
 * https://leetcode.com/problems/rearrange-array-elements-by-sign/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class RearrangeArrayElementsBySign {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }

        int s = 0;
        int t = 0;
        int in = 0;
        int si = 0;
        int ti = 0;

        while (s < pos.size() && t < neg.size()) {
            if (in % 2 == 0) {
                nums[in] = pos.get(si++);
                s++;
            } else {
                nums[in] = neg.get(ti++);
                t++;
            }
            in++;
        }

        while (s < pos.size()) {
            nums[in++] = pos.get(si++);
            s++;
        }

        while (t < neg.size()) {
            nums[in++] = neg.get(ti++);
            t++;
        }
        return nums;
    }
}
