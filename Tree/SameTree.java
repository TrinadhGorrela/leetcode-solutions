/**
 * 100. Same Tree
 * Difficulty: Easy | Tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
 * https://leetcode.com/problems/same-tree/
 *
 * Pattern: Depth-First Search (Structural Comparison)
 * Key insight: Two trees are identical iff both are null, or both non-null with equal values and matching left and right subtrees, checked recursively in pre-order.
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
class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
