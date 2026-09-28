class Solution {

    public ListNode mergeKLists(
            ListNode[] lists) {

        if (lists == null ||
            lists.length == 0) {

            return null;
        }

        // Min heap compares nodes by value
        PriorityQueue<ListNode> minHeap =
                new PriorityQueue<>(
                    (a, b) -> a.val - b.val
                );

        // Add first node of every list
        for (ListNode node : lists) {

            if (node != null) {
                minHeap.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {

            // Get smallest current node
            ListNode node = minHeap.poll();

            current.next = node;
            current = current.next;

            // Add next node from the same list
            if (node.next != null) {
                minHeap.offer(node.next);
            }
        }

        return dummy.next;
    }
}
