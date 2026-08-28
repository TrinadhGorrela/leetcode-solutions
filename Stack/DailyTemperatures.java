/**
 * 739. Daily Temperatures
 * Difficulty: Medium | Tags: Array, Stack, Monotonic Stack
 * https://leetcode.com/problems/daily-temperatures/
 *
 * Pattern: Monotonic Stack (Next Greater Distance)
 * Key insight: Scan from right to left keeping a decreasing stack of indices; pop smaller/equal temperatures and the distance to the remaining top is the answer for each day.
 *
 * Time Complexity: O(N) - Monotonic stack operations are amortized O(1)
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temperatures.length];
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return res;
    }
}
