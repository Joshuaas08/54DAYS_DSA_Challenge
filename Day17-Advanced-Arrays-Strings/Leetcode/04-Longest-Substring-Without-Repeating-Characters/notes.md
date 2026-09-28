# Longest Substring Without Repeating Characters

## Pattern

Sliding Window

## Idea

Maintain a window containing unique characters.

If a duplicate appears:

1. Remove characters from the left.
2. Move left forward.
3. Continue until the window becomes valid.

## Example

s = "abcabcbb"

Longest substring:

"abc"

Length = 3

## Complexity

Time: O(n)

Space: O(n)

## Key Idea

Use two pointers to maintain a valid window.
