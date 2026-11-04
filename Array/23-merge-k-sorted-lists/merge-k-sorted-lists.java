class Solution {

    ListNode merge2sortedList(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(-1);
        ListNode point = dummy;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                point.next = l1;
                l1 = l1.next;
            } else {
                point.next = l2;
                l2 = l2.next;
            }

            point = point.next;
        }

        if (l1 != null) {
            point.next = l1;
        }

        if (l2 != null) {
            point.next = l2;
        }

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode result = lists[0];

        for (int i = 1; i < lists.length; i++) {
            result = merge2sortedList(result, lists[i]);
        }

        return result;
    }
}