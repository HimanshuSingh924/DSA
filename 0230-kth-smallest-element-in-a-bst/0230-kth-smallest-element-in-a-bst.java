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
    int count = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        
        return ans;
    }

    private void helper(TreeNode root, int k){
        if(null == root) return;

        helper(root.left, k);
        count += 1;
        if(k == count) ans = root.val;

        helper(root.right, k);
    }
}