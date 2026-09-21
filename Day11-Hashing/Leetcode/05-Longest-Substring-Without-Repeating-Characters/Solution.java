import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();

        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            if (lastSeen.containsKey(current)) {
                left = Math.max(
                    left,
                    lastSeen.get(current) + 1
                );
            }

            lastSeen.put(current, right);

            longest = Math.max(
                longest,
                right - left + 1
            );
        }

        return longest;
    }
}
