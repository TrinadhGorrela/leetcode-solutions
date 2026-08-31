/**
 * 239. Sliding Window Maximum
 * Difficulty: Hard | Tags: Array, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue, Range Minimum/Maximum Query
 * https://leetcode.com/problems/sliding-window-maximum/
 *
 * Pattern: Monotonic Deque (Sliding Window Maximum)
 * Key insight: Maintain a deque of indices whose corresponding values are strictly decreasing; when adding a new element, evict all smaller values from the back (they can never be the max while the new one is in the window), then evict expired indices from the front. The front always holds the current window's maximum.
 *
 * Time Complexity: O(N) - Each index is pushed and popped from the deque at most once, giving amortized O(1) per element
 * Space Complexity: O(k) - Deque stores at most k indices (one per window position)
 *
 * Edge Cases Handled: k equals array length (single window), k = 1 (each element is its own max), strictly increasing input (deque shrinks to size 1 each step), all identical values, decreasing input (deque holds all k indices)
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
