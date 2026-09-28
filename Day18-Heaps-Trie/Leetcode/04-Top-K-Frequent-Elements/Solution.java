class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        // Count frequencies
        Map<Integer, Integer> frequency =
                new HashMap<>();

        for (int num : nums) {

            frequency.put(
                num,
                frequency.getOrDefault(num, 0) + 1
            );
        }

        // Min heap based on frequency
        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>(
                    (a, b) -> frequency.get(a) - frequency.get(b)
                );

        for (int num : frequency.keySet()) {

            minHeap.offer(num);

            // Keep only k most frequent elements
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
