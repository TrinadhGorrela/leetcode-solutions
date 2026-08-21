/**
 * 112. Path Sum
 * Difficulty: Easy | Tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
 * https://leetcode.com/problems/path-sum/
 *
 * Pattern: Tree
 * Key insight: Systematically processes the input relying on tree principles.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Requires space for the recursion call stack
 *
 * Edge Cases Handled: Per LeetCode constraints (e.g., array length >= 1)
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root, targetSum);
    }

    public static boolean pathSum(TreeNode root, int target) {
        if (root == null) {
            return false;
        }

        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            return true;
        }
        return pathSum(root.left, target) || pathSum(root.right, target);
    }
}
