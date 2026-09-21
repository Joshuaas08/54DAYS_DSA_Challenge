import java.util.*;

class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();

        int left = 0;
        int maxFreq = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            freq.put(
                current,
                freq.getOrDefault(current, 0) + 1
            );

            maxFreq = Math.max(
                maxFreq,
                freq.get(current)
            );

            int windowLength = right - left + 1;

            int replacements = windowLength - maxFreq;

            if (replacements > k) {
                char leftChar = s.charAt(left);

                freq.put(
                    leftChar,
                    freq.get(leftChar) - 1
                );

                left++;
            }

            longest = Math.max(
                longest,
                right - left + 1
            );
        }

        return longest;
    }
}
