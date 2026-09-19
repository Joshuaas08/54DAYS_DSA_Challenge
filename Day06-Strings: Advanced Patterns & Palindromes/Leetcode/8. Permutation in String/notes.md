📝 Notes

A permutation contains exactly the same characters with the same frequencies.

Example:

s1 = "ab"

Permutations:
ab
ba

For:

s2 = "eidbaooo"

We check windows of size 2:

ei

id
db
ba  ← Match

Instead of generating every permutation:

Maintain a fixed-size window.
Track character frequencies.
Compare the frequency arrays.

Time: O(n)
Space: O(1)

Key Takeaway:
When you see permutation/anagram inside a string, think:

Sliding Window + Frequency Counting
