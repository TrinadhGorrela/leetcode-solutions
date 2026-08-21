/**
 * 278. First Bad Version
 * Difficulty: Easy | Tags: Binary Search, Interactive
 * https://leetcode.com/problems/first-bad-version/
 *
 * Pattern: Binary Search
 * Key insight: Systematically processes the input relying on binary search principles.
 *
 * Time Complexity: O(log N) - Search space is halved per iteration in a monotonic sequence
 * Space Complexity: O(1) - Only primitive variables used for tracking state
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {

                start = mid + 1;
            }
        }
        return start;
    }
}
