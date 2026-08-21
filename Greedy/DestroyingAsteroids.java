/**
 * 2126. Destroying Asteroids
 * Difficulty: Medium | Tags: Array, Greedy, Sorting
 * https://leetcode.com/problems/destroying-asteroids/
 *
 * Pattern: Array
 * Key insight: Systematically processes the input relying on array principles.
 *
 * Time Complexity: O(N log N) - Dominated by the sorting operation on the input array
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class DestroyingAsteroids {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;

        for (int i : asteroids) {
            if (currMass < i) {
                return false;
            }
            currMass += i;
        }
        return true;
    }
}
