/**
 * 881. Boats to Save People
 * Difficulty: Medium | Tags: Array, Two Pointers, Greedy, Sorting, Timsort
 * https://leetcode.com/problems/boats-to-save-people/
 *
 * Pattern: Sorting + Two Pointers (Opposite Ends)
 * Key insight: Sort weights; pair the lightest and heaviest remaining people, sending the heaviest alone if they exceed the limit, else together, counting one boat per pass.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int left = 0;
        int right = people.length - 1;
        int res = 0;
        Arrays.sort(people);
        while (left <= right) {
            int sum = people[left] + people[right];
            if (sum > limit) {
                res++;
                right--;
            } else {
                res++;
                left++;
                right--;
            } 
        }
        return res;
    }
}
