import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> firstSeen = new HashMap<>();

        // Balance 0 exists before the array starts
        firstSeen.put(0, -1);

        int balance = 0;
        int longest = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                balance--;
            } else {
                balance++;
            }

            if (firstSeen.containsKey(balance)) {

                int length = i - firstSeen.get(balance);

                longest = Math.max(longest, length);

            } else {

                // Store only the first occurrence
                firstSeen.put(balance, i);
            }
        }

        return longest;
    }
}
