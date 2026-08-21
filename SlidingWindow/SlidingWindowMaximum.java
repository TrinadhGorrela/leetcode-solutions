/**
 * 239. Sliding Window Maximum
 * Difficulty: Hard | Tags: Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue, Range Minimum/Maximum Query
 * https://leetcode.com/problems/sliding-window-maximum/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N) - Monotonic queue operations are amortized O(1)
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> max = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            while (!max.isEmpty() && nums[max.getLast()] < nums[i]) {
                max.removeLast();
            }

            max.add(i);

        }

        list.add(nums[max.getFirst()]);

        for (int i = k; i < nums.length; i++) {
            while (!max.isEmpty() && nums[max.getLast()] < nums[i]) {
                max.removeLast();
            }

            max.add(i);

            if (max.getFirst() == i - k) {
                max.removeFirst();
            }
            list.add(nums[max.getFirst()]);
        }

        int[] res = new int[list.size()];
        int in = 0;

        for (int i : list) {
            res[in++] = i;
        }

        return res;
    }
}
