# Minimum Window Substring

## Pattern

Advanced Sliding Window

## Goal

Find the smallest substring of s that contains every
character from t with the required frequency.

## Idea

Expand right until the window becomes valid.

Then:

1. Record the window.
2. Move left.
3. Continue shrinking while the window remains valid.

When removing a required character makes the window
invalid, stop shrinking.

## Example

s = "ADOBECODEBANC"
t = "ABC"

Answer:

"BANC"

## Complexity

Time: O(n)

Space: O(1)

The frequency array has a fixed character range.

## Key Idea

Expand → Validate → Shrink → Repeat
