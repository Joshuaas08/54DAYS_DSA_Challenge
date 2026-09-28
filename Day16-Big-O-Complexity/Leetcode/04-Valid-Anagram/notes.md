# Notes — Valid Anagram

## Idea

Count the frequency of every character.

For string s:

count[c]++

For string t:

count[c]--

If every value is zero, the strings are anagrams.

## Time Complexity

O(n)

We traverse both strings.

The final loop has only 26 elements:

O(26) → O(1)

Therefore:

O(n)

## Space Complexity

O(1)

The frequency array always contains 26 positions.

## Important Big O Lesson

Even though we use an array, its size is fixed.

Therefore:

O(26) → O(1)

## Key Learning

A fixed-size data structure is O(1) space.
