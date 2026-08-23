/**
 * 2126. Destroying Asteroids
 * Difficulty: Medium | Tags: Array, Greedy, Sorting
 * https://leetcode.com/problems/destroying-asteroids/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
