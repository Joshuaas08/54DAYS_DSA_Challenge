# Longest Repeating Character Replacement

## Pattern

Sliding Window + Frequency Count

## Idea

For every window:

window length - most frequent character count

tells us how many replacements are required.

If replacements > k:

shrink the window.

## Example

s = "AABABBA"
k = 1

Answer = 4

Possible substring:

"AABA"

## Complexity

Time: O(n)

Space: O(1)

## Key Formula

replacements =
windowSize - maxFrequency

## Key Idea

Keep the most frequent character unchanged and replace
the remaining characters.
