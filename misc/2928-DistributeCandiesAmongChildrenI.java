/**
 * 2928. Distribute Candies Among Children I
 * Difficulty: Easy | Tags: Math, Combinatorics, Enumeration
 * https://leetcode.com/problems/distribute-candies-among-children-i/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
