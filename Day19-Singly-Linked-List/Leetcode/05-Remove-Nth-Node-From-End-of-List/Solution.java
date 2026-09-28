class Solution {

    public ListNode removeNthFromEnd(
            ListNode head,
            int n) {

        // Dummy node handles removing the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // Create a gap of n nodes
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        // until fast reaches the end
        while (fast.next != null) {

            slow = slow.next;
            fast = fast.next;
        }

        // Remove the target node
        slow.next = slow.next.next;

        return dummy.next;
    }
}
