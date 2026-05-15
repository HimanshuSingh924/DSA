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
    public ListNode mergeNodes(ListNode head) {
        // List<Integer> list = new ArrayList<>();
		// List<Integer> ans = new ArrayList<>();
		// while (head != null)
		// {
		// 	list.add(head.val);
		// 	head = head.next;
		// }

		// int sum = 0;
		// for (int i = 1; i < list.size(); i++)
		// {
		// 	if (list.get(i) != 0)
		// 	{
		// 		sum += list.get(i);
		// 	}
		// 	else
		// 	{
		// 		ans.add(sum);
		// 		sum=0;
		// 	}
		// }
		
		// ListNode newHead = new ListNode(ans.get(0));
		// ListNode curr = newHead;

		// for (int i = 1; i < ans.size(); i++)
		// {
		// 	curr.next = new ListNode(ans.get(i));
		// 	curr = curr.next;
		// }

		// return newHead;
 
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int sum = 0;

        head = head.next;

        while(head != null){
            if(0 != head.val){
                sum += head.val;
            }else{
                ListNode temp = new ListNode(sum);

                curr.next = temp;
                curr = curr.next;

                sum = 0;
            }

            head = head.next;
        }

        return dummy.next;
    }
}