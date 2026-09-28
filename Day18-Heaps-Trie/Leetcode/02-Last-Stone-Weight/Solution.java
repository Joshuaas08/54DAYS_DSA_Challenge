class Solution {

    public int lastStoneWeight(int[] stones) {

        // Max heap
        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>(Collections.reverseOrder());

        // Add all stones
        for (int stone : stones) {
            maxHeap.offer(stone);
        }

        while (maxHeap.size() > 1) {

            // Get two heaviest stones
            int first = maxHeap.poll();
            int second = maxHeap.poll();

            // If they are different,
            // put the remaining weight back
            if (first != second) {
                maxHeap.offer(first - second);
            }
        }

        // No stones left
        if (maxHeap.isEmpty()) {
            return 0;
        }

        return maxHeap.peek();
    }
}
