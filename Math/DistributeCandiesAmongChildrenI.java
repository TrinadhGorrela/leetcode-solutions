/**
 * 2928. Distribute Candies Among Children I
 * Difficulty: Easy | Tags: Math, Combinatorics, Enumeration
 * https://leetcode.com/problems/distribute-candies-among-children-i/
 *
 * Pattern: Combinatorial Enumeration
 * Key insight: Enumerate the first two children's shares up to the per-child limit, and count assignments where the remaining candies for the third child are non-negative and within limit.
 *
 * Time Complexity: O(limit^2) - Nested loops run from 0 to limit, independent of n
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
class DistributeCandiesAmongChildrenI {
    public int distributeCandies(int n, int limit) {
        int res = 0;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                if (n - i - j <= limit && n - i - j >= 0) {
                    res++;
                }
            }
        }
        return res;
    }
}
