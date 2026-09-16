# Notes — Reverse String

## Idea

Reverse the character array in-place.

Use two pointers:

left  → first character
right → last character

Swap them and move toward the center.

## Important Java Concept

Strings are immutable in Java.

The problem gives us a char[] because we need to modify
the characters directly.

## Approach

1. Set left = 0.
2. Set right = n - 1.
3. Swap s[left] and s[right].
4. Move left forward.
5. Move right backward.
6. Continue until they meet.

## Example

['h','e','l','l','o']

After reversing:

['o','l','l','e','h']

## Complexity

Time: O(n)
Space: O(1)

## Key Learning

Use char[] when you need to modify individual characters.
