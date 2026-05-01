/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    private int size(ListNode head){
        int count = 0;
        ListNode ptr = head;

        while(ptr != null){
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;

		int sizeOfListA = size(headA);
		int sizeOfListB = size(headB);
		int diff = sizeOfListA - sizeOfListB;

		System.out.println(sizeOfListA+"  "+sizeOfListB+"  "+diff);

		ListNode ptr1 = headA;
		ListNode ptr2 = headB;

		if (diff > 0)
		{
			while (diff > 0)
			{
				ptr1 = ptr1.next;
				diff--;
			}
		}
		else
		{
			while (diff < 0)
			{
				ptr2 = ptr2.next;
				diff++;
			}
		}

		while (ptr1 != ptr2)
		{
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		return ptr1;
	}
}