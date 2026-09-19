# 3. Longest Substring Without Repeating Characters

## Pattern
Variable-size sliding window + HashSet.

## Approach

Maintain a window containing only unique characters.

right expands the window.

If a duplicate appears:

Move left forward until the duplicate is removed.

At every step calculate:

window length = right - left + 1

## Complexity

Time: O(n)
Space: O(k)

where k is the number of unique characters.

## Key Takeaway

When the window becomes invalid:

Shrink it from the left until it becomes valid again.

Pattern:

Expand → Check → Shrink → Update
