/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
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
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(null == head) return null;
        else if(null == head.next) return new TreeNode(head.val);

        ListNode mid = middleNode(head);

        TreeNode root = new TreeNode(mid.val);

        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        
        return root;
    }

    private ListNode middleNode(ListNode head){
        if(null == head) return null;

        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = slow;

        while(null != fast && null != fast.next){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;

        return slow;
    }
}