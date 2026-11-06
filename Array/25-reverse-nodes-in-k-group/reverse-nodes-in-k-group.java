class Solution {

    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nxt = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode temp = head;
        ListNode prev = dummy;

        while(temp != null){
            ListNode curr = temp;
            int cnt = 1;

            while(cnt < k && curr != null){
                curr = curr.next;
                cnt++;
            }

            if(curr == null) break;

            ListNode nextNode = curr.next;
            curr.next = null;

            ListNode newNode = reverse(temp);
            prev.next = newNode;
            temp.next = nextNode;

            prev = temp;
            temp = nextNode;
            curr = nextNode;
        }

        return dummy.next;
    }
}