class Solution {

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null &&
               fast.next != null) {

            // Slow moves one step
            slow = slow.next;

            // Fast moves two steps
            fast = fast.next.next;
        }

        return slow;
    }
}
