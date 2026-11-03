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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode prev = head;
        ListNode curr = head;

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode l = head;
        while(l.next != null){
            length++;
            l = l.next;
        }

        k = k % length;
        if(k == 0) return head;

        while(k > 0){
            curr = curr.next;
            k--;
        }
        while(curr.next != null){
            prev = prev.next;
            curr = curr.next;
        }

        curr.next = head;
        head = prev.next;
        prev.next = null;

        return head;
    }
}