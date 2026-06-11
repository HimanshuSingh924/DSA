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
    // List<Integer> inorder = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
    
        inorderTraversal(inorder, root);
        return buildBalancedBST(inorder, 0, inorder.size() - 1);
    }

    private void inorderTraversal(List<Integer> inorder, TreeNode root) {
        if (root == null) return;

        inorderTraversal(inorder, root.left);
        inorder.add(root.val);
        inorderTraversal(inorder, root.right);
    }

    private TreeNode buildBalancedBST(List<Integer> inorder,int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(inorder.get(mid));

        root.left = buildBalancedBST(inorder, start, mid - 1);
        root.right = buildBalancedBST(inorder, mid + 1, end);

        return root;
    }
}
