# Notes — Longest Palindromic Substring

## Idea

Find the longest substring that reads the same forward
and backward.

Example:

"babad"

Possible answers:

"bab"
"aba"

## Approach

Use the "expand around center" technique.

Every palindrome has a center.

There are two types:

### Odd Length

Example:

"aba"

Center:

b

We start with:

left = i
right = i

### Even Length

Example:

"abba"

Center is between the two b's.

We start with:

left = i
right = i + 1

## Expand

While:

left >= 0
right < s.length()
s.charAt(left) == s.charAt(right)

expand outward.

## Important Java Functions

charAt()
substring()
length()
Math.max()

## Complexity

Time: O(n²)
Space: O(1)

## Key Learning

For palindrome problems, "expand around center" is an important
technique to recognize.
