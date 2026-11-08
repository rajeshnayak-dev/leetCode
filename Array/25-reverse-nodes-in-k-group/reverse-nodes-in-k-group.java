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
    ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode nxt = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;

        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr;
            int cnt = 1;

            while(cnt < k && temp != null){
                temp = temp.next;
                cnt++;
            }

            if (temp == null) break;

            ListNode nextNode = temp.next;
            temp.next = null;

            ListNode newNode = reverse(curr);
            prev.next = newNode;

            prev = curr;
            curr = nextNode;
        }
        prev.next = curr;

        return dummy.next;
    }
}