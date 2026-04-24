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
class Solution {
    // HimanshuSingh924
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode lNode1 = list1;
		ListNode lNode2 = list2;

		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;

		while (lNode1 != null && lNode2 != null) {
			if (lNode1.val < lNode2.val) {
				dummy.next = lNode1;
				lNode1 = lNode1.next;
			}
			else {
				dummy.next = lNode2;
				lNode2 = lNode2.next;
			}

			dummy = dummy.next;
		}

        dummy.next = (lNode1 != null) ? lNode1 : lNode2;

		return head.next;
    }
}