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
    public int[] nextLargerNodes(ListNode head) {
        int size = size(head);
        int[] arr = new int[size];
        ListNode newHead = reverse(head);

        Stack<Integer> st = new Stack<>();
        st.push(newHead.val);

        ListNode curr = newHead.next;
        int ptr = size-2;

        while(ptr >= 0){
            int ele = curr.val;
            curr = curr.next;

            while(st.size() > 0 && st.peek() <= ele){
                st.pop();
            }

            // if(st.size() == 0) arr[ptr] = 0; 
            // else arr[ptr] = st.peek();

            arr[ptr] = (st.size() == 0) ? 0 : st.peek();

            st.push(ele);
            ptr--;
        }
        return arr;
	}

    private int size(ListNode head){
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr =curr.next;
        }
        return count;
    }

    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
}