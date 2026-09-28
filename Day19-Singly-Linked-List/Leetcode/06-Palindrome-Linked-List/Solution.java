class Solution {

    public boolean isPalindrome(ListNode head) {

        if (head == null ||
            head.next == null) {

            return true;
        }

        // Find the middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null &&
               fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        ListNode secondHalf = reverse(slow);

        // Compare both halves
        ListNode firstHalf = head;
        ListNode current = secondHalf;

        while (current != null) {

            if (firstHalf.val != current.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            current = current.next;
        }

        return true;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }
}
