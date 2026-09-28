class Solution {

    public int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        // Each entry:
        // [value, row, column]
        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>(
                    (a, b) -> a[0] - b[0]
                );

        // Add the first element from each row
        for (int row = 0; row < Math.min(n, k); row++) {

            minHeap.offer(
                new int[] {
                    matrix[row][0],
                    row,
                    0
                }
            );
        }

        // Remove the smallest element k times
        for (int i = 0; i < k - 1; i++) {

            int[] current = minHeap.poll();

            int row = current[1];
            int col = current[2];

            // Add next element from the same row
            if (col + 1 < n) {

                minHeap.offer(
                    new int[] {
                        matrix[row][col + 1],
                        row,
                        col + 1
                    }
                );
            }
        }

        return minHeap.peek()[0];
    }
}
