/**
 * 2037. Minimum Number of Moves to Seat Everyone
 * Difficulty: Easy | Tags: Array, Greedy, Sorting, Counting Sort
 * https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
 *
 * Pattern: Sorting + Greedy
 * Key insight: Pair each student with the closest seat; after sorting both arrays, summing pairwise absolute differences yields the minimum total movement.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class MinimumNumberOfMovesToSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(seats[i] - students[i]);
        }

        return res;
    }
}
