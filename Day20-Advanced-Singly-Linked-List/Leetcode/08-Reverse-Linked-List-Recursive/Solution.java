class Solution {

    public ListNode reverseList(ListNode head) {

        // Base case
        if (head == null ||
            head.next == null) {

            return head;
        }

        // Reverse the rest of the list
        ListNode newHead =
                reverseList(head.next);

        // Put current node after the next node
        head.next.next = head;

        // Remove old forward connection
        head.next = null;

        return newHead;
    }
}
