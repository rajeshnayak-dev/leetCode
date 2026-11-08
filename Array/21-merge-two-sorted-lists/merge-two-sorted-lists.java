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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

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

        if (temp1 != null) {
            prev.next = temp1;
        }

        if (temp2 != null) {
            prev.next = temp2;
        }

        return dummy.next;
    }
}