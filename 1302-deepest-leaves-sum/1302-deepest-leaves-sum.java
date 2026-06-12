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
class Solution {
    int ans = 0;
    public int deepestLeavesSum(TreeNode root) {
        int height = height(root);
        helper(root, height);

        return ans;
    }

    private int height(TreeNode root){
        if(null == root) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    private void helper(TreeNode root, int height){
        if(null == root) return;

        if(1 == height) ans = ans + root.val;

        helper(root.left, height - 1);
        helper(root.right, height - 1);
    }
}