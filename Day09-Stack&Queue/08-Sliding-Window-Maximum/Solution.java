import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < n; right++) {

            // Remove indices outside the window
            while (!deque.isEmpty() &&
                   deque.peekFirst() <= right - k) {

                deque.pollFirst();
            }

            // Remove smaller elements
            while (!deque.isEmpty() &&
                   nums[deque.peekLast()] <= nums[right]) {

                deque.pollLast();
            }

            deque.offerLast(right);

            // Start recording answers
            if (right >= k - 1) {

                result[right - k + 1] =
                    nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
