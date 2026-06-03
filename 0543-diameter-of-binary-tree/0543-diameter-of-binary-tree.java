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
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(null == root) return 0;
        height(root);
        return dia;
    }

    private int height(TreeNode root){
        if(null == root) return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        dia = Math.max(leftHeight + rightHeight, dia);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}