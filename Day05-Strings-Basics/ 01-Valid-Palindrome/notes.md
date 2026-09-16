# Notes — Valid Palindrome

## Idea

A palindrome reads the same from left to right and right to left.

We use two pointers:

left  → beginning
right → end

Compare both characters and move toward the center.

## Important Java Functions

Character.isLetterOrDigit()
Character.toLowerCase()
String.charAt()

## Approach

1. Start two pointers.
2. Skip characters that are not letters or digits.
3. Convert characters to lowercase.
4. Compare them.
5. Move both pointers toward the center.

## Example

"A man, a plan, a canal: Panama"

Ignore spaces and punctuation:

"amanaplanacanalpanama"

This is a palindrome.

## Complexity

Time: O(n)
Space: O(1)

## Key Learning

Two pointers are very useful for palindrome problems.
