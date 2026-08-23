/**
 * 2037. Minimum Number of Moves to Seat Everyone
 * Difficulty: Easy | Tags: Array, Greedy, Sorting, Counting Sort
 * https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
