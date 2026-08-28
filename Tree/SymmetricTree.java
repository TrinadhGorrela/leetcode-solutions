/**
 * 101. Symmetric Tree
 * Difficulty: Easy | Tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
 * https://leetcode.com/problems/symmetric-tree/
 *
 * Pattern: Depth-First Search (Mirror Comparison)
 * Key insight: A tree is symmetric when its left and right subtrees are mirrors, i.e., left.left matches right.right and left.right matches right.left, comparing recursively.
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
class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isSym(root.left, root.right);
    }

    public static boolean isSym(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isSym(left.right, right.left) && isSym(left.left, right.right);
    }
}
