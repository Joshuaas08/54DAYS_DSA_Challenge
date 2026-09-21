# Group Anagrams

## Pattern

HashMap + Frequency Array

## Key Idea

Two strings are anagrams if they have the same character frequencies.

Example:

"eat" -> [1,0,0,0,1,...,1]
"tea" -> [1,0,0,0,1,...,1]

Therefore, use the frequency array as the HashMap key.

## Complexity

Let N = number of strings
and K = maximum string length.

Time: O(N * K)
Space: O(N * K)

## Takeaway

When multiple objects have the same "signature",
use that signature as a HashMap key.
