class Solution {

    public int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';

            count[index]++;

            // Most frequent character in the window
            maxFrequency = Math.max(
                maxFrequency,
                count[index]
            );

            // Characters that need replacement
            int replacements =
                    (right - left + 1) - maxFrequency;

            // Window is invalid
            if (replacements > k) {

                count[s.charAt(left) - 'A']--;
                left++;
            }

            // Update answer
            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }

        return maxLength;
    }
}
