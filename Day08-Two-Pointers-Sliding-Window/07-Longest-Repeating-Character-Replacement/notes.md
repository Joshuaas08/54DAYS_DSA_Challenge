# 424. Longest Repeating Character Replacement

## Pattern
Variable-size sliding window + frequency array.

## Main Idea

For every window:

window length - frequency of most common character

tells us how many characters need to be replaced.

If replacements > k:

shrink the window.

Otherwise the window is valid.

## Complexity

Time: O(n)
Space: O(1)

## Key Takeaway

A powerful sliding-window formula is:

window size - most frequent element

If that value exceeds the allowed number of changes, shrink the window.
