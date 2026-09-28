class Solution {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Either start a new subarray
            // or extend the current subarray
            currentSum = Math.max(
                nums[i],
                currentSum + nums[i]
            );

            // Update global maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
