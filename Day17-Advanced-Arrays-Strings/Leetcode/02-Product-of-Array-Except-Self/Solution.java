class Solution {

    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        // Store product of all elements to the left
        int prefix = 1;

        for (int i = 0; i < n; i++) {

            result[i] = prefix;

            prefix *= nums[i];
        }

        // Multiply by product of all elements to the right
        int suffix = 1;

        for (int i = n - 1; i >= 0; i--) {

            result[i] *= suffix;

            suffix *= nums[i];
        }

        return result;
    }
}
