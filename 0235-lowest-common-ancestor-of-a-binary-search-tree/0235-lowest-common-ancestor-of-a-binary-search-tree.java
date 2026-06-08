/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(null == root) return null;

        TreeNode ans = root;

        while(null != ans){
            if(ans.val < p.val && ans.val < q.val)
                ans = ans.right;
            else if(ans.val > p.val && ans.val > q.val)
                ans = ans.left;
            else
                break;
        }
        return ans;       
    }
}