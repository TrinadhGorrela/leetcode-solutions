/**
 * 836. Rectangle Overlap
 * Difficulty: Easy | Tags: Math, Geometry
 * https://leetcode.com/problems/rectangle-overlap/
 *
 * Pattern:
 * Key insight:
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
 */
class RectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int minHt = Math.max(rec1[0], rec2[0]);
        int maxHt = Math.min(rec1[2], rec2[2]);

        int ht = maxHt - minHt;

        int minWt = Math.max(rec1[1], rec2[1]);
        int maxWt = Math.min(rec1[3], rec2[3]);

        int wt = maxWt - minWt;

        return (ht > 0) && (wt > 0);
    }
}
