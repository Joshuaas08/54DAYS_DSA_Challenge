import java.util.*;

class Solution {
    public int fourSumCount(
        int[] nums1,
        int[] nums2,
        int[] nums3,
        int[] nums4
    ) {

        Map<Integer, Integer> pairSum = new HashMap<>();

        // Store A + B
        for (int a : nums1) {
            for (int b : nums2) {
                int sum = a + b;

                pairSum.put(
                    sum,
                    pairSum.getOrDefault(sum, 0) + 1
                );
            }
        }

        int result = 0;

        // Search for -(C + D)
        for (int c : nums3) {
            for (int d : nums4) {

                int target = -(c + d);

                result += pairSum.getOrDefault(target, 0);
            }
        }

        return result;
    }
}
