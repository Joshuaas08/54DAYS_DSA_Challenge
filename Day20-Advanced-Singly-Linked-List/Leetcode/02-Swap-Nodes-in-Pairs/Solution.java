class Solution {

    public ListNode swapPairs(ListNode head) {

        // Dummy node simplifies pointer manipulation
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null &&
               prev.next.next != null) {

            // First node in the pair
            ListNode first = prev.next;

            // Second node in the pair
            ListNode second = first.next;

            // Perform swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move to the next pair
            prev = first;
        }

        return dummy.next;
    }
}
