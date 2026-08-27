/**
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 * Difficulty: Medium | Tags: Array, Hash Table, Divide and Conquer, Tree, Binary Tree
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 *
 * Pattern: Tree Construction Hash Map
 * Key insight: Use hash map for O(1) inorder index lookup and recursively split tree bounds
 *
 * Time Complexity: O(N) - Visit each node once to construct
 * Space Complexity: O(N) - Hash map and recursion stack
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
class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    private static int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap<>();
        preIndex = 0;

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return helper(inorderMap, preorder, 0, inorder.length - 1);
    }

    private static TreeNode helper(Map<Integer, Integer> inorderMap, int[] preorder, int st, int end) {
        if (st < 0 || end > preorder.length || st > end) {
            return null;
        }

        int mid = inorderMap.get(preorder[preIndex]);
        TreeNode root = new TreeNode(preorder[preIndex++]);
        root.left = helper(inorderMap, preorder, st, mid - 1);
        root.right = helper(inorderMap, preorder, mid + 1, end);
        return root;
    }
}
