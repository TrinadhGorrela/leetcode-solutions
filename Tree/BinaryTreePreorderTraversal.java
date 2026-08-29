/**
 * 144. Binary Tree Preorder Traversal
 * Difficulty: Easy | Tags: Stack, Tree, Depth-First Search, Binary Tree
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 *
 * Pattern: Depth-First Search
 * Key insight: Recursively traverses the current node, left subtree, then right subtree.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
 *
 * Edge Cases Handled: empty tree / null root (returns empty list), single node, skewed tree (left or right only), leaf nodes (null children)
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
class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }

    public static void traversal(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        res.add(root.val);
        traversal(root.left, res);
        traversal(root.right, res);
    }
}
