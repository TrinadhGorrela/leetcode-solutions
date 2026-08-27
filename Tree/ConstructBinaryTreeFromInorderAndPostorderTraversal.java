/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 * Difficulty: Medium | Tags: Array, Hash Table, Divide and Conquer, Tree, Binary Tree
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 *
 * Pattern: 
 * Key insight: 
 *
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 *
 * Edge Cases Handled: Per LeetCode constraints
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
class ConstructBinaryTreeFromInorderAndPostorderTraversal {
    private static int postIndex = 0;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();
        postIndex = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return helper(inorderMap, postorder, 0, postorder.length - 1);
    }

    private static TreeNode helper(Map<Integer, Integer> inorderMap, int[] postorder, int st, int end) {
        if (st < 0 || end > postorder.length || st > end) {
            return null;
        }

        int mid = inorderMap.get(postorder[postIndex]);
        TreeNode root = new TreeNode(postorder[postIndex--]);
        root.right = helper(inorderMap, postorder, mid + 1, end);
        root.left = helper(inorderMap, postorder, st, mid - 1);
        return root;
    }
}
