/**
 * 503. Next Greater Element II
 * Difficulty: Medium | Tags: Array, Stack, Monotonic Stack
 * https://leetcode.com/problems/next-greater-element-ii/
 *
 * Pattern: Monotonic Stack (Circular Array, Twice-Length)
 * Key insight: Iterate over the doubled-circular array right-to-left keeping a decreasing stack; the nearest greater element for each position is the stack top after popping smaller values, which naturally handles the wrap.
 *
 * Time Complexity: O(N) - Monotonic stack operations are amortized O(1)
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class NextGreaterElementIi {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        int n = nums.length;
        for (int i = 2 * n - 1; i > 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i % n] = -1;
            } else {
                res[i % n] = stack.peek();
            }
            stack.push(nums[i % n]);
        }
        return res;
    }
}
