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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = new ListNode(-1);
        ListNode temp1 = odd;
        ListNode even = new ListNode(-1);
        ListNode temp2 = even;

        ListNode temp = head;
        int pos = 1;

        while (temp != null) {
            if (pos % 2 == 1) {
                temp1.next = new ListNode(temp.val);
                temp1 = temp1.next;
            } else {
                temp2.next = new ListNode(temp.val);
                temp2 = temp2.next;
            }

            temp = temp.next;
            pos++;
        }

        temp1.next = even.next;

        return odd.next;
    }
}
