Instead of finding the longest palindrome, we count all palindromic substrings.

For every character:

1. Treat it as the center.
2. Expand left and right.
3. Count every valid palindrome.

We need to check:

expandFromCenter(s, i, i);

for odd-length palindromes and:

expandFromCenter(s, i, i + 1);

for even-length palindromes.

Time: O(n²)
Space: O(1)

Key Takeaway:
The same Expand Around Center pattern can solve multiple palindrome problems.
