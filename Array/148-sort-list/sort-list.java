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
    ListNode middle(ListNode head){
        ListNode f = head;
        ListNode s = head;

        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next.next;
        }

        return s;
    }

    ListNode merge2SortedList(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                prev.next = temp1;
                temp1 = temp1.next;
            }else{
                prev.next = temp2;
                temp2 = temp2.next;
            }

            prev = prev.next;
        }

        if(temp1 != null) prev.next = temp1;
        if(temp2 != null) prev.next = temp2;

        return dummy.next;
    }

    ListNode mergeSort(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode mdl = middle(head);

        ListNode f = head;
        ListNode s = mdl.next;

        mdl.next = null;

        f = mergeSort(f);
        s = mergeSort(s);

        return merge2SortedList(f, s);
    }
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
}