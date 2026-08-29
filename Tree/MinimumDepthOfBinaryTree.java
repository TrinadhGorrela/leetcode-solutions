/**
 * 111. Minimum Depth of Binary Tree
 * Difficulty: Easy | Tags: Tree, Depth-First Search, Breadth-First Search, Binary Tree
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 *
 * Pattern: Depth-First Search (Post-order with Single-Child Handling)
 * Key insight: Minimum depth requires a leaf (no children); if a node has only one child, take that child's depth, otherwise the smaller of the two, since a path must end at a leaf.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(V) - Maintains visited states or queue/stack depth
 *
 * Edge Cases Handled: empty tree / null root (returns 0), single node, node with only one child (left or right null)
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
class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0) {
            return 1 + right;
        }

        if (right == 0) {
            return 1 + left;
        }
        return 1 + Math.min(left, right);
    }
}
