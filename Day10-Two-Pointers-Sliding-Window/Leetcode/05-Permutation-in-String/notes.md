# 567. Permutation in String

## Pattern
Fixed-size sliding window + frequency array.

## Approach

A permutation has exactly the same character frequencies.

The window size must always equal:

s1.length()

Maintain two frequency arrays:

count1 → characters in s1
count2 → characters in current window

Slide the window through s2.

For every window, compare the frequencies.

## Complexity

Time: O(26 × n)
Space: O(26)

Since 26 is constant:

Time is effectively O(n).

## Key Takeaway

When checking whether a substring is an anagram/permutation:

Think:

Fixed-size window + frequency count.
