import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {

        Deque<Integer> increasing = new ArrayDeque<>();
        Deque<Integer> decreasing = new ArrayDeque<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            // Maintain increasing deque
            while (!increasing.isEmpty() &&
                   nums[increasing.peekLast()] > nums[right]) {

                increasing.pollLast();
            }

            increasing.offerLast(right);

            // Maintain decreasing deque
            while (!decreasing.isEmpty() &&
                   nums[decreasing.peekLast()] < nums[right]) {

                decreasing.pollLast();
            }

            decreasing.offerLast(right);

            // Shrink invalid window
            while (nums[decreasing.peekFirst()] -
                   nums[increasing.peekFirst()] > limit) {

                if (increasing.peekFirst() == left) {
                    increasing.pollFirst();
                }

                if (decreasing.peekFirst() == left) {
                    decreasing.pollFirst();
                }

                left++;
            }

            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }

        return maxLength;
    }
}
