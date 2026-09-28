class Solution {

    public int findKthLargest(int[] nums, int k) {

        // Min heap stores the k largest elements
        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();

        for (int num : nums) {

            minHeap.offer(num);

            // Keep only k elements
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Smallest element among the k largest
        // is the kth largest element
        return minHeap.peek();
    }
}
