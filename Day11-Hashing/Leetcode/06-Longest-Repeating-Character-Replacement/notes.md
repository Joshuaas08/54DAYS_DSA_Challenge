# Longest Repeating Character Replacement

## Pattern

HashMap + Sliding Window

## Key Idea

Inside the current window:

window length - most frequent character count

= number of replacements needed

If replacements > k:

shrink the window.

## Formula

replacements =
window_size - max_frequency

Valid window:

replacements <= k

## Example

s = "AABABBA"
k = 1

Window:

AABA

A occurs 3 times.

Window size = 4

Replacements = 4 - 3 = 1

Valid.

## Complexity

Time: O(N)
Space: O(Alphabet Size)

## Takeaway

For:

"Longest substring after at most K changes"

Think:

Sliding Window + Frequency Map
