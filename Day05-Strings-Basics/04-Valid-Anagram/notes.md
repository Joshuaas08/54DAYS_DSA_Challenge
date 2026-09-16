# Notes — Valid Anagram

## Idea

Two strings are anagrams if they contain exactly the same
characters with the same frequencies.

Example:

"anagram"
"nagaram"

Both contain:

a → 3
n → 2
g → 1
r → 1
m → 1

## Important Java Functions

charAt()
length()

## Frequency Array

Since the problem contains lowercase English letters,
we can use:

int[] count = new int[26];

Character 'a' maps to index 0.
Character 'b' maps to index 1.
...
Character 'z' maps to index 25.

index = character - 'a'

## Approach

For s:

count[c]++

For t:

count[c]--

At the end, every count should be 0.

## Complexity

Time: O(n)
Space: O(1)

## Key Learning

Frequency arrays are faster and simpler than sorting when
the character range is known.
