/**
 * 145. Binary Tree Postorder Traversal
 * Difficulty: Easy | Tags: Stack, Tree, Depth-First Search, Binary Tree
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 *
 * Pattern: Depth-First Search
 * Key insight: Recursively traverses the left subtree, right subtree, then current node.
 *
 * Time Complexity: O(V + E) - Traverses all vertices and edges in the graph structure
 * Space Complexity: O(N) - Uses an auxiliary collection that scales with input size
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
class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }

    public static void traversal(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        traversal(root.left, res);
        traversal(root.right, res);
        res.add(root.val);
    }
}
