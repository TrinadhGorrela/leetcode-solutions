/**
 * 104. Maximum Depth of Binary Tree
 * Difficulty: Easy | Tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * Pattern: Depth-First Search (Post-order Height)
 * Key insight: The depth of a node is 1 plus the larger of its children's depths; compute bottom-up recursively.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(V) - Maintains visited states or queue/stack depth
 *
 * Edge Cases Handled: empty tree / null root (returns 0), single node, skewed tree (left-only or right-only chain)
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
class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
