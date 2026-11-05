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
    ListNode merge2Lists(ListNode l1, ListNode l2){
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode point = dummy;

        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                point.next = temp1;
                temp1 = temp1.next;
            }else{
                point.next = temp2;
                temp2 = temp2.next;
            }

            point = point.next;
        }

        if(temp1 != null){
            point.next = temp1;
        }else{
            point.next = temp2;
        }

        return dummy.next;

    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }

        ListNode result = lists[0];
        for(int i = 1; i < lists.length; i++){
            result = merge2Lists(result, lists[i]);
        }

        return result;
    }
}